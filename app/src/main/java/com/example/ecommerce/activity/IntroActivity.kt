package com.example.ecommerce.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.ecommerce.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {
    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sử dụng ViewBinding đúng cách
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root) // Quan trọng: dùng binding.root

        // Kiểm tra xem nút có bị null không
        if (binding.startBtn == null) {
            Log.e("IntroActivity", "startBtn is null! Kiểm tra lại ID trong XML.")
        } else {
            Log.d("IntroActivity", "startBtn đã tìm thấy!")
        }

        // Sự kiện click cho nút Start
        binding.startBtn.setOnClickListener {
            Log.d("IntroActivity", "Button clicked! Chuyển sang MainActivity...")
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
            finish() // Đóng IntroActivity để tránh quay lại khi nhấn Back
        }
    }
}
