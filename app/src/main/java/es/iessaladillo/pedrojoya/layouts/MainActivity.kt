package es.iessaladillo.pedrojoya.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.iessaladillo.pedrojoya.layouts.databinding.ConstraintlayoutActivityBinding
import es.iessaladillo.pedrojoya.layouts.databinding.LinearlayoutActivityBinding
import es.iessaladillo.pedrojoya.layouts.databinding.RelativelayoutActivityBinding

class MainActivity : AppCompatActivity() {

    // Descomentar según la actividad que se quiera ver
    private lateinit var binding: LinearlayoutActivityBinding
    //private lateinit var binding: RelativelayoutActivityBinding
    //private lateinit var binding: ConstraintlayoutActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: USAR UNO DE LOS LAYOUTS DEFINIDOS PARA PROBARLO.
        binding = LinearlayoutActivityBinding.inflate(layoutInflater)
        //binding = RelativelayoutActivityBinding.inflate(layoutInflater)
        //binding = ConstraintlayoutActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}