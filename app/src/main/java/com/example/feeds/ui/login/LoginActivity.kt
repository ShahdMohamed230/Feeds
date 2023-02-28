package com.example.feeds.ui.login

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.feeds.ui.matrials.MaterialsActivity
import com.example.feeds.R
import com.example.feeds.User
import com.example.feeds.databinding.ActivityLoginBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {


    private val TAG = "LoginActivity"

    lateinit var binding: ActivityLoginBinding
    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDatabase: DatabaseReference
    private val LOGIN = "LOGIN"
    private val SIGNUP = "SIGNUP"

    private var currentVisibleView = LOGIN
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {

            startActivity(Intent(binding.root.context,MaterialsActivity ::class.java))
        }
     /*   binding.apply {

            FirebaseApp.initializeApp(root.context)
            mAuth = FirebaseAuth.getInstance()
            mDatabase = FirebaseDatabase.getInstance().reference

            rgLogin.setOnCheckedChangeListener { group, checkedId ->
                if (checkedId == R.id.rb_login)
                    makeVisibleLogin()
                else
                    makeVisibleSignup()
            }

            btnLogin.setOnClickListener {
                if (currentVisibleView == LOGIN)
                    login()
                else
                    register()
            }
        }
    }

    private fun makeVisibleLogin() {
        currentVisibleView = LOGIN
        binding.inputName.visibility = View.GONE
        binding.inputPassConf.visibility = View.GONE
        binding.inputAddress.visibility = View.GONE
    }

    private fun makeVisibleSignup() {
        currentVisibleView = SIGNUP
        binding.inputName.visibility = View.VISIBLE
        binding.inputPassConf.visibility = View.VISIBLE
        binding.inputAddress.visibility = View.VISIBLE
    }

    private fun login() {
        if (!validateForm())
            return
        val email = binding.edtEmail.text.toString()
        val password: String = binding.edtPass.text.toString()
        mAuth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
            startActivity(Intent(binding.root.context, MaterialsActivity::class.java))
        }
    }

    private fun register() {
        if (!registerValidateForm())
            return
        val email = binding.edtEmail.text.toString()
        val password: String = binding.edtPass.text.toString()
        val address: String = binding.edtAddress.text.toString()
        mAuth.createUserWithEmailAndPassword(email, password).addOnSuccessListener {
            Log.i(TAG, "DONE")
            it.user?.uid?.let { it1 ->
                mDatabase.child("users").child(it1).setValue(User(email, password, address))
                    .addOnSuccessListener {
                        startActivity(Intent(binding.root.context, MaterialsActivity::class.java))
                    }
            }
        }.addOnFailureListener {
            Log.i(TAG,it.message.toString())
        }
    }

    private fun validateForm(): Boolean {
        var valid = true
        val email = binding.edtEmail.text.toString().trim { it <= ' ' }
        val password = binding.edtPass.text.toString().trim { it <= ' ' }
        if (TextUtils.isEmpty(email)) {
            binding.inputEmail.error = getString(R.string.email_alert_1)
            valid = false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            valid = false
            binding.inputEmail.error = getString(R.string.email_alert_2)
        } else {
            binding.inputEmail.error = null
        }
        if (TextUtils.isEmpty(password)) {
            binding.inputPass.error = getString(R.string.pass_alert)
            valid = false
        } else {
            binding.inputPass.error = null
        }
        return valid
    }

    private fun registerValidateForm(): Boolean {
        var valid = true
        val name = binding.edtName.text.toString().trim { it <= ' ' }
        val email = binding.edtEmail.text.toString().trim { it <= ' ' }
        val password = binding.edtPass.text.toString().trim { it <= ' ' }
        val passwordConf = binding.edtPassConf.text.toString().trim { it <= ' ' }
        if (TextUtils.isEmpty(name)) {
            binding.inputName.error = getString(R.string.name_alert)
            valid = false
        }
        if (TextUtils.isEmpty(email)) {
            binding.inputEmail.error = getString(R.string.email_alert_1)
            valid = false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            valid = false
            binding.inputEmail.error = getString(R.string.email_alert_2)
        } else {
            binding.inputEmail.error = null
        }
        if (TextUtils.isEmpty(password)) {
            binding.inputPass.error = getString(R.string.pass_alert)
            valid = false
        } else {
            binding.inputPass.error = null
        }
        if (TextUtils.isEmpty(passwordConf)) {
            binding.inputPass.error = getString(R.string.pass_alert)
            valid = false
        }
        return valid*/
    }
}