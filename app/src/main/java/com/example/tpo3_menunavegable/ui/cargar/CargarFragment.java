package com.example.tpo3_menunavegable.ui.cargar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.tpo3_menunavegable.MainActivity.*;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3_menunavegable.MainActivity;
import com.example.tpo3_menunavegable.databinding.FragmentCargarBinding;
import com.example.tpo3_menunavegable.modelo.Producto;

import java.util.ArrayList;
import java.util.Comparator;

public class CargarFragment extends Fragment {

    private FragmentCargarBinding binding;
    private CargarViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(CargarViewModel.class);
        binding = FragmentCargarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Observe
        vm.getProducto().observe(getViewLifecycleOwner(), producto -> {
            binding.tvError.setText("");
            binding.etCodigo.setText("");
            binding.etDescripcion.setText("");
            binding.etPrecio.setText("");
            Toast.makeText(getContext(), "El producto se ha agregado correctamente!!", Toast.LENGTH_SHORT).show();
        });

        vm.getError().observe(getViewLifecycleOwner(), error -> {
            binding.tvError.setText(error);
        });

        //Listener
        binding.btAgregar.setOnClickListener(v -> {
            String c = binding.etCodigo.getText().toString().trim();
            String d = binding.etDescripcion.getText().toString().trim();
            String p = binding.etPrecio.getText().toString().trim();
            vm.cargarProducto(c,d,p);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}