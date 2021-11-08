package com.example.googlekeepneo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class NuevaNota extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.nueva_nota,null);

        EditText titulo = dialogView.findViewById(R.id.titulo);
        EditText contenido = dialogView.findViewById(R.id.contenido);
        CheckBox idea = dialogView.findViewById(R.id.idea);
        CheckBox task = dialogView.findViewById(R.id.task);
        CheckBox importante = dialogView.findViewById(R.id.importante);
        Button aceptar = dialogView.findViewById(R.id.aceptar);
        Button cancelar = dialogView.findViewById(R.id.cancelar);

        builder.setView(dialogView).setMessage("nueva nota");

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nota nota = new Nota();
                nota.setContenido(contenido.getText().toString());
                nota.setTitulo(titulo.getText().toString());
                nota.setIdea(idea.isChecked());
                nota.setImportante(importante.isChecked());
                nota.setTarea(task.isChecked());

                MainActivity main = (MainActivity) getActivity();
                main.crearNuevaNota(nota);

                dismiss();
            }
        });

        return builder.create();
    }


}