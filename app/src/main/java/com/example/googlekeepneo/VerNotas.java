package com.example.googlekeepneo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class VerNotas extends DialogFragment {

    private TextView titulo,contenido;
    private ImageView idea,tarea,importante;
    private Button ok;
    View dialogView;
    private Nota nota;

    public VerNotas(Nota nota){
        this.nota=nota;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder((getActivity()));
        LayoutInflater inflater = getActivity().getLayoutInflater();
        dialogView = inflater.inflate(R.layout.abrir_nota,null);

        init();

        if(!nota.isImportante()){
            importante.setVisibility(View.GONE);
        }
        if(!nota.isTarea()){
            tarea.setVisibility(View.GONE);
        }
        if(!nota.isIdea()){
            idea.setVisibility(View.GONE);
        }

        titulo.setText(nota.getTitulo());
        contenido.setText(nota.getContenido());

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return builder.create();
    }

    private void init(){
        titulo = dialogView.findViewById(R.id.titulo2);
        contenido = dialogView.findViewById(R.id.contenido);
        idea = dialogView.findViewById(R.id.ideaIcono);
        tarea = dialogView.findViewById(R.id.tareaIcono);
        importante = dialogView.findViewById(R.id.importanteIcono);
        ok = dialogView.findViewById(R.id.aceptar2);
    }
}
