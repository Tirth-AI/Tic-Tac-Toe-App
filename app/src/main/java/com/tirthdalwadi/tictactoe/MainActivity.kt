package com.tirthdalwadi.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.tirthdalwadi.tictactoe.databinding.ActivityMainBinding
import com.tirthdalwadi.tictactoe.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun buttonClicked(view: View)
    {
        val currentBtn = view as Button
        count++

        if(currentBtn.text == "")
        {
            if(flag == 0)
            {
                currentBtn.text = "X"
                flag = 1
                binding.tvTurn.text = "Turn: 0"
            }
            else if(flag == 1)
            {
                currentBtn.text = "0"
                flag = 0
                binding.tvTurn.text = "Turn: X"
            }

            val b1 = binding.btn1.text
            val b2 = binding.btn2.text
            val b3 = binding.btn3.text
            val b4 = binding.btn4.text
            val b5 = binding.btn5.text
            val b6 = binding.btn6.text
            val b7 = binding.btn7.text
            val b8 = binding.btn8.text
            val b9 = binding.btn9.text

            if(b1 == b2 && b2 == b3 && b1 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b1", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b4 == b5 && b5 == b6 && b4 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b4", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b7 == b8 && b8 == b9 && b7 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b7", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b1 == b4 && b4 == b7 && b1 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b1", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b2 == b5 && b5 == b8 && b2 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b2", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b3 == b6 && b6 == b9 && b3 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b3", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b1 == b5 && b5 == b9 && b1 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b1", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(b3 == b5 && b5 == b7 && b3 != "")
            {
                Toast.makeText( this@MainActivity, "Winner is $b3", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
            else if(count == 9)
            {
                Toast.makeText( this@MainActivity, "Match is Draw", Toast.LENGTH_SHORT).show()
                resetBoard()
            }
        }
    }

    private fun resetBoard()
    {
        count = 0
        flag = 0
        binding.tvTurn.text = "Turn: X"
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
    }
}