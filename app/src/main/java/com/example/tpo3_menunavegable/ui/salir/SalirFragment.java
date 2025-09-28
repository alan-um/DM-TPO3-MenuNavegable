package com.example.tpo3_menunavegable.ui.salir;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3_menunavegable.MainActivity;
import com.example.tpo3_menunavegable.databinding.FragmentSalirBinding;
import com.example.tpo3_menunavegable.ui.listar.ListarViewModel;

public class SalirFragment extends Fragment {

    private FragmentSalirBinding binding;
    private SalirViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(SalirViewModel.class);
        binding = FragmentSalirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvSalir;
        vm.getText().observe(getViewLifecycleOwner(), textView::setText);

        binding.btSalir.setOnClickListener(v -> {
            if(getActivity()!=null){
                getActivity().finish();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}