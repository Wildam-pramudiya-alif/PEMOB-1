package com.example.inputcontrol

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etPhone: EditText
    private lateinit var btnConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPhone = findViewById(R.id.et_phone_number)
        btnConfirm = findViewById(R.id.btn_confirm)

        btnConfirm.setOnClickListener {
            val phone = etPhone.text.toString()

            if (phone.isBlank()) {
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Konfirmasi")
                    .setMessage("Apakah Anda sudah yakin telah mengisi nomor telepon dengan benar?")
                    .setPositiveButton("Yes") { _, _ ->
                    }
                    .setNegativeButton("No", null)
                    .show()
            }
        }
    }
}
