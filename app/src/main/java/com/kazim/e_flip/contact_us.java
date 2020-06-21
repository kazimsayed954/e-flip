package com.kazim.e_flip;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class contact_us extends AppCompatActivity {
    Dialog myDialog;
    Button subs;
    String result_message;
    ImageView fb;
    ImageView insta;
    ImageView blog;
    ImageView linkin;
    ImageView ytbe;
    ImageView twitr;
    ImageView kindl;
    ImageView fph5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        fb=findViewById(R.id.fb);
        insta=findViewById(R.id.insta);
        blog=findViewById(R.id.blog);
        linkin=findViewById(R.id.linkedin);
        ytbe=findViewById(R.id.youtube);
        twitr=findViewById(R.id.twitter);
        kindl=findViewById(R.id.kindle);
        fph5=findViewById(R.id.html5book);
        subs=findViewById(R.id.subscribe);
        myDialog = new Dialog(this);

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSesWTIK9bwuvYzWgtrbyaXeWml2vxNpGlp2VlsD_apU6LUKtA/viewform";
                Intent intent=new Intent(contact_us.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/eflipmagazine/"));
                startActivity(browserIntent);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/eflipmagazine/?hl=en"));
                startActivity(browserIntent);
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eflipmagazine.blogspot.com/"));
                startActivity(browserIntent);
            }
        });
        kindl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=eflip+magazine&ref=nb_sb_noss"));
                startActivity(browserIntent);
            }
        });
        ytbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCgwOwe2o5necuJq7NGw0bug"));
                startActivity(browserIntent);
            }
        });

        twitr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/eflipmagazine"));
                startActivity(browserIntent);
            }
        });
        linkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/e-flipmagazine/"));
                startActivity(browserIntent);
            }
        });
        fph5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fliphtml5.com/bookcase/ibsnt"));
                startActivity(browserIntent);
            }
        });

    }


    public void ShowPopup(View v) {
        TextView txtclose;
        Button home;
        Button abt;
        Button editns;
        Button contctus;
        myDialog.setContentView(R.layout.custom_popup);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("X");
        home=myDialog.findViewById(R.id.home);
        abt=myDialog.findViewById(R.id.about);
        editns=myDialog.findViewById(R.id.editions);
        contctus=myDialog.findViewById(R.id.contact_us);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(contact_us.this,MainActivity.class);
                startActivity(intent);
                }
        });
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(contact_us.this,about.class);
                startActivity(intent);            }
        });
        editns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(contact_us.this,bookCase.class);
                startActivity(intent);            }
        });
        contctus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.dismiss();          }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
