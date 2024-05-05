package com.example.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Base_Theme_TicTacToe)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
    var flag=0
    var count=0
    var cond=true;
    @SuppressLint("SetTextI18n")
    fun check(view: View){
        val currbtn = view as Button

        if (currbtn.text == "" && cond==true){
            count++
            if (flag==0){
                currbtn.text = "X"
                flag=1
                binding.turn.text = "Player O turn"
            }
            else{
                currbtn.text = "O"
                flag=0
                binding.turn.text = "Player X turn"
            }

        }
        if (count>4){
            if (binding.btn1.text.toString()==binding.btn2.text.toString() && binding.btn2.text.toString() == binding.btn3.text.toString() && binding.btn2.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn1.text}"
                cond=false


            }
            else if (binding.btn4.text.toString()==binding.btn5.text.toString() && binding.btn5.text.toString() == binding.btn6.text.toString() && binding.btn5.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn4.text}"
                cond=false
            }
            else if (binding.btn7.text.toString()==binding.btn8.text.toString() && binding.btn8.text.toString() == binding.btn9.text.toString() && binding.btn9.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn7.text}"
                cond=false
            }
            else if (binding.btn1.text.toString()==binding.btn4.text.toString() && binding.btn4.text.toString() == binding.btn7.text.toString() && binding.btn4.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn1.text}"
                cond=false
            }
            else if (binding.btn2.text.toString()==binding.btn5.text.toString() && binding.btn5.text.toString() == binding.btn8.text.toString() && binding.btn2.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn2.text}"
                cond=false
            }
            else if (binding.btn3.text.toString()==binding.btn6.text.toString() && binding.btn6.text.toString() == binding.btn9.text.toString() && binding.btn3.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn3.text}"
                cond=false
            }
            else if (binding.btn1.text.toString()==binding.btn5.text.toString() && binding.btn5.text.toString() == binding.btn9.text.toString() && binding.btn1.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn1.text}"
                cond=false
            }
            else if (binding.btn3.text.toString()==binding.btn5.text.toString() && binding.btn5.text.toString() == binding.btn7.text.toString() && binding.btn3.text.toString() != ""){
                binding.turn.text = "Winner is ${binding.btn3.text}"
                cond=false
            }
            else if(count==9){
//                Toast.makeText(this,"Match is Draw" ,Toast.LENGTH_LONG).show()
//                Toast.makeText(this,"Match Restart" ,Toast.LENGTH_LONG).show()
                binding.turn.text = "Match is drawn"
                cond=false
            }

        }
    }
    @SuppressLint("SetTextI18n")
    fun restart(view: View){
        binding.btn1.text =""
        binding.btn2.text =""
        binding.btn3.text =""
        binding.btn4.text =""
        binding.btn5.text =""
        binding.btn6.text =""
        binding.btn7.text =""
        binding.btn8.text =""
        binding.btn9.text =""
        binding.turn.text = "Player X turn "
        flag=0
        count=0
        cond=true
    }
}