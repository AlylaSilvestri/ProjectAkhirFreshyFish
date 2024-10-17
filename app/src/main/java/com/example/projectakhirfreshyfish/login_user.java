package com.example.projectakhirfreshyfish;

import android.widget.TextView;

TextView signUpText = findViewById(R.id.sign_up_text);

String signUpString = "Don't have an account? Sign up";
SpannableString spannableString = new SpannableString(signUpString);

// Membuat bagian "Sign up" dapat diklik
ClickableSpan clickableSpan = new ClickableSpan() {
    @Override
    public void onClick(@NonNull View widget) {
        // Alihkan ke halaman sign up
        Intent intent = new Intent(CurrentActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    @Override
    public void updateDrawState(@NonNull TextPaint ds) {
        super.updateDrawState(ds);
        ds.setColor(Color.BLUE); // Ubah warna Sign Up menjadi biru
        ds.setUnderlineText(false); // Menghilangkan garis bawah jika tidak diperlukan
    }
};

// Set span untuk kata "Sign up"
spannableString.setSpan(clickableSpan, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
signUpText.setText(spannableString);
signUpText.setMovementMethod(LinkMovementMethod.getInstance());

public class login_user {
}
