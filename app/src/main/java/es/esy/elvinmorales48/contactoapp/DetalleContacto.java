package es.esy.elvinmorales48.contactoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    Button btnDetalles;
    TextView tvNombre, tvFecha, tvTel, tvEmail, tvDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        btnDetalles = (Button) findViewById(R.id.btnEditarDatos);

        Bundle parametros = getIntent().getExtras();

        String nombre       = parametros.getString("Nombre");
        String fecha        = parametros.getString("Fecha");
        String tel          = parametros.getString("Telefono");
        String email        = parametros.getString("Email");
        String descripcion  = parametros.getString("Descripcion");

        tvNombre       = (TextView) findViewById(R.id.tvNameEdit);
        tvFecha        = (TextView) findViewById(R.id.tvFechaEdit);
        tvTel          = (TextView) findViewById(R.id.tvTelEdit);
        tvEmail        = (TextView) findViewById(R.id.tvEmailEdit);
        tvDescripcion  = (TextView) findViewById(R.id.tvDescEdit);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTel.setText(tel);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        btnDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
