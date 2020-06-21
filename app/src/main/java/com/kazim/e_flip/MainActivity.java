package com.kazim.e_flip;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//

public class MainActivity extends AppCompatActivity {
    String result_message;
    Button internship;
    Button subs;
    Button quiz;
    Button CA;
    Button publish;
    Button advertise;
    ImageView book;
    ImageView fb;
    ImageView insta;
    ImageView blog;
    ImageView linkin;
    ImageView ytbe;
    ImageView twitr;
    ImageView kindl;
    ImageView fph5;
    TextView mail;
    Dialog myDialog;
    Button nav;
    TextView clckhere;


    AdapterViewFlipper adapterViewFlipper;
    int[] IMAGES={
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);

        nav=findViewById(R.id.navbutton);
        internship=findViewById(R.id.intern);
        subs=findViewById(R.id.subs);
        quiz=findViewById(R.id.quiz);
        CA=findViewById(R.id.ca);
        publish=findViewById(R.id.publish);
        advertise=findViewById(R.id.adv);
        book=findViewById(R.id.pdf_book);
        fb=findViewById(R.id.fb);
        insta=findViewById(R.id.insta);
        blog=findViewById(R.id.blog);
        linkin=findViewById(R.id.linkedin);
        ytbe=findViewById(R.id.youtube);
        twitr=findViewById(R.id.twitter);
        kindl=findViewById(R.id.kindle);
        fph5=findViewById(R.id.html5book);
        mail=findViewById(R.id.mail_us);
        clckhere=findViewById(R.id.clk);
    adapterViewFlipper=findViewById(R.id.adapterViewFlipper);
    CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),IMAGES);
    adapterViewFlipper.setAdapter(customAdapter);
    adapterViewFlipper.setFlipInterval(1800);
    adapterViewFlipper.setAutoStart(true);



    //-------------------------------------------------------------------------------------------//


        internship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSe_3C0pr_unAemuzpmCtUrqbG6w-Ch0-jsEnk15xIo5TcpBtg/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pdf_activity.class);
                startActivity(intent);

            }
        });
        clckhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pdf_activity.class);
                startActivity(intent);

            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSesWTIK9bwuvYzWgtrbyaXeWml2vxNpGlp2VlsD_apU6LUKtA/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSc4DZcw_P4DkyX3jpl5KWC5xnjXGtyxqd3k4Wh5Lg4-dapTRg/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });

        CA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLScZpOwUQ89VA2PY90nZGAFLHa-_7nhDSZm02ik4BrOcQ6HINQ/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });

        publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSezleTiUAEfGs5IMAkvRXcUdRLnifOmTDXRjGpNr6ZuDHbEww/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result_message);
                startActivity(intent);

            }
        });

        advertise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_message="https://docs.google.com/forms/d/e/1FAIpQLSep_jbka2omjz74PRMq142umHILmCudpRGoWfoSak71pl7elg/viewform";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
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

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "eflipmagazine@gmail.com"));

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

//                Intent intent=new Intent(MainActivity.this,MainActivity.class);
//                startActivity(intent);
                  myDialog.dismiss();}
        });
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,about.class);
                startActivity(intent);            }
        });
        editns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,bookCase.class);
                startActivity(intent);            }
        });
        contctus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,contact_us.class);
                startActivity(intent);            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}


class CustomAdapter extends BaseAdapter{
    Context context;
    int[] images;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] images) {
        this.context=applicationContext;
        this.images=images;
        inflater=LayoutInflater.from(applicationContext);

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view=inflater.inflate(R.layout.list_review,null);
        ImageView imageView=view.findViewById(R.id.review);
        imageView.setImageResource(images[position]);
        return view;
    }
}
