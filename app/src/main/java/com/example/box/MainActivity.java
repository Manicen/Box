package com.example.box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //private FrameLayout frameLayout;
    private Button button;
    int key = 0, blueline = 0, kt = 0, kt2 = 0;
    boolean k = false;
    boolean flag = true;
    private int a = 0;
    private int cv1 = 0, cv2 = 0, cv3 = 0, cv = 4, bl = 0, tb = 6;
    private int nm1 = 0, nm2 = 0, nm3 = 0, nm4 = 0, s = 0, m = 0;
    private int screen = 0, p1 = 0, p2 = 0, i = 0, ml = 0;
    int[] num = {R.drawable.zero, R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine};
    int[] colors = {R.drawable.red, R.drawable.orange, R.drawable.yellow, R.drawable.gren, R.drawable.blue, R.drawable.purple};
    int[] imagek = {R.drawable.key, R.drawable.key_o};
    int[] imaget = {R.drawable.key_table_menu, R.drawable.key_table_menuo};
    int[] imageb = {R.drawable.blue_line_m, R.drawable.blue_line_m2};
    int[] pocket = {R.drawable.pocket, R.drawable.pocket2, R.drawable.pocket3};
    int[] socket = {R.drawable.socket_br, R.drawable.socket_wh};
    int[] molot = {R.drawable.molot, R.drawable.moloto};
    int[] ik = {R.drawable.keyice, R.drawable.keyiiiiii};
    int[] polka = {R.drawable.polkacl, R.drawable.polkaop};
    int[] sc = {R.drawable.wall1, R.drawable.wall4, R.drawable.wall3, R.drawable.wall2, R.drawable.cases, R.drawable.cases_open, R.drawable.table_clouse, R.drawable.table_open, R.drawable.tab, R.drawable.picture, R.drawable.gus_rech, R.drawable.tv_off, R.drawable.tv_on, R.drawable.full, R.drawable.you_win};

    ImageView fon;
    ImageView youwin;
    ImageView left;
    ImageView right;
    ImageView down;
    ImageView rz;
    ImageButton imagePocket;
    ImageButton imageButton2;
    ImageButton imageBlue;
    ImageButton imageBlue_line;
    ImageButton imageCv1;
    ImageButton imageCv2;
    ImageButton imageCv3;
    ImageButton n1;
    ImageButton n2;
    ImageButton n3;
    ImageButton n4;
    ImageButton imagekey;
    ImageButton imagekey_table;
    ImageButton imagekey_table2;
    ImageButton door;
    ImageButton cs;
    ImageButton soc;
    ImageButton pas;
    ImageButton table;
    ImageButton pen;
    ImageButton gus;
    ImageButton tv;
    ImageButton keyt;
    ImageButton mol;
    ImageButton molotok;
    ImageButton pol;
    ImageButton ikey;
    ImageButton polka1;
    ImageButton polka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fon = (ImageView) findViewById(R.id.fon);
        left = (ImageView) findViewById(R.id.left);
        right = (ImageView) findViewById(R.id.right);
        down = (ImageView) findViewById(R.id.down);
        rz = (ImageView) findViewById(R.id.rz);

        youwin = (ImageView) findViewById(R.id.youwin);
        imagePocket = (ImageButton) findViewById(R.id.imagePocket);
        imageBlue_line = (ImageButton) findViewById(R.id.imageBlue_line);

        imagekey = (ImageButton) findViewById(R.id.key);
        imagekey_table = (ImageButton) findViewById(R.id.kt);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageBlue = (ImageButton) findViewById(R.id.imageBlue);
        imageCv1 = (ImageButton) findViewById(R.id.imageCv1);
        imageCv2 = (ImageButton) findViewById(R.id.imageCv2);
        imageCv3 = (ImageButton) findViewById(R.id.imageCv3);
        imagekey_table2 = (ImageButton) findViewById(R.id.kt2);
        n1 = (ImageButton) findViewById(R.id.n1);
        n2 = (ImageButton) findViewById(R.id.n2);
        n3 = (ImageButton) findViewById(R.id.n3);
        n4 = (ImageButton) findViewById(R.id.n4);
        cs = (ImageButton) findViewById(R.id.cs);
        soc = (ImageButton) findViewById(R.id.soc);
        pas = (ImageButton) findViewById(R.id.pas);
        pen = (ImageButton) findViewById(R.id.pen);

        door = (ImageButton) findViewById(R.id.door);
        table = (ImageButton) findViewById(R.id.table);
        gus = (ImageButton) findViewById(R.id.gus);
        tv = (ImageButton) findViewById(R.id.tv);
        keyt = (ImageButton) findViewById(R.id.keytbl2);
        pol = (ImageButton) findViewById(R.id.pol);
        polka1 = (ImageButton) findViewById(R.id.polka1);
        polka2 = (ImageButton) findViewById(R.id.polka2);
        mol = (ImageButton) findViewById(R.id.mol);
        ikey = (ImageButton) findViewById(R.id.ikey);
        molotok = (ImageButton) findViewById(R.id.molotok);

        youwin.setVisibility(View.GONE);
        rz.setVisibility(View.GONE);
        imagekey_table2.setVisibility(View.GONE);
        imageButton2.setVisibility(View.GONE);
        imageCv1.setVisibility(View.GONE);
        imageCv2.setVisibility(View.GONE);
        imageCv3.setVisibility(View.GONE);
        n1.setVisibility(View.GONE);
        n2.setVisibility(View.GONE);
        n3.setVisibility(View.GONE);
        n4.setVisibility(View.GONE);
        imageBlue.setVisibility(View.GONE);
        imageBlue_line.setVisibility(View.GONE);
        table.setVisibility(View.GONE);
        imagekey.setVisibility(View.GONE);
        imagekey_table.setVisibility(View.GONE);
        door.setVisibility(View.GONE);
        cs.setVisibility(View.GONE);
        down.setVisibility(View.GONE);
        soc.setVisibility(View.GONE);
        pas.setVisibility(View.GONE);
        pen.setVisibility(View.GONE);
        gus.setVisibility(View.GONE);
        tv.setVisibility(View.GONE);
        polka2.setVisibility(View.GONE);
        pol.setVisibility(View.GONE);
        polka1.setVisibility(View.GONE);
        keyt.setVisibility(View.GONE);
        ikey.setVisibility(View.GONE);
        mol.setVisibility(View.GONE);
        molotok.setVisibility(View.GONE);

        cs.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                down.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                fon.setImageResource(sc[cv]);
                imageButton2.setVisibility(View.VISIBLE);
                imageCv1.setVisibility(View.VISIBLE);
                imageCv2.setVisibility(View.VISIBLE);
                imageCv3.setVisibility(View.VISIBLE);
                cs.setVisibility(View.GONE);
                soc.setVisibility(View.GONE);
                tv.setVisibility(View.GONE);
                pol.setVisibility(View.GONE);
            }
        });
        pol.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                down.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                fon.setImageResource(R.drawable.full);
                polka1.setVisibility(View.VISIBLE);
                polka2.setVisibility(View.VISIBLE);
                cs.setVisibility(View.GONE);
                soc.setVisibility(View.GONE);
                tv.setVisibility(View.GONE);
                pol.setVisibility(View.GONE);
            }
        });
        polka1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(kt == 1){
                    imagekey_table.setVisibility(View.GONE);
                    p1 = (p1 + 1) % 2;
                    polka1.setImageResource(polka[p1]);
                    if(ml == 0 && p1 == 1){
                        mol.setVisibility(View.VISIBLE);
                    }
                    else{
                        mol.setVisibility(View.GONE);}
                }
            }
        });
        polka2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(kt2 == 1) {
                    p2 = (p2 + 1) % 2;
                    polka2.setImageResource(polka[p2]);
                    if (i == 0 && p2 == 1) {
                        ikey.setVisibility(View.VISIBLE);
                    } else {
                        ikey.setVisibility(View.GONE);
                    }
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                down.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                fon.setImageResource(sc[11 + s]);
                tv.setVisibility(View.GONE);
                cs.setVisibility(View.GONE);
                soc.setVisibility(View.GONE);
                pol.setVisibility(View.GONE);
            }
        });

        imageCv1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    cv1 = (cv1 + 1) % 6;
                    imageCv1.setImageResource(colors[cv1]);}
                else{
                    cv1 = (cv1 + 1) % 6;
                    imageCv1.setImageResource(colors[cv1]);}
                flag = !flag;
            }
        });
        imageCv2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    cv2 = (cv2 + 1) % 6;
                    imageCv2.setImageResource(colors[cv2]);}
                else{
                    cv2 = (cv2 + 1) % 6;
                    imageCv2.setImageResource(colors[cv2]);}
                flag = !flag;
            }
        });
        imageCv3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag){
                    cv3 = (cv3 + 1) % 6;
                    imageCv3.setImageResource(colors[cv3]);}
                else{
                    cv3 = (cv3 + 1) % 6;
                    imageCv3.setImageResource(colors[cv3]);}
                flag = !flag;
            }
        });
       n1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                nm1 = (nm1 + 1) % 10;
                n1.setImageResource(num[nm1]);
            }
        });
        n2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                nm2 = (nm2 + 1) % 10;
                n2.setImageResource(num[nm2]);
            }
        });
        n3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                nm3 = (nm3 + 1) % 10;
                n3.setImageResource(num[nm3]);
            }
        });
        n4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                nm4 = (nm4 + 1) % 10;
                n4.setImageResource(num[nm4]);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (cv1 == 1 && cv2 == 0 && cv3 == 5){
                    cv = 5;
                    fon.setImageResource(sc[cv]);
                    if(bl == 0)
                        imageBlue.setVisibility(View.VISIBLE);
                    imageButton2.setVisibility(View.GONE);
                    imageCv2.setVisibility(View.GONE);
                    imageCv3.setVisibility(View.GONE);
                    imageCv1.setVisibility(View.GONE);
                }
            }
        });

        imageBlue.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                imageBlue.setVisibility(View.GONE);
                bl = 1;
                imageBlue_line.setVisibility(View.VISIBLE);
            }
        });

        imagePocket.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (a < 3){
                    imagePocket.setImageResource(pocket[a]);
                    a++;
                }
                else{
                    imagePocket.setVisibility(View.GONE);
                    imagekey_table.setVisibility(View.VISIBLE);
                }
            }
        });
        door.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (key == 1){
                    youwin.setVisibility(View.VISIBLE);
                    door.setVisibility(View.GONE);
                    fon.setVisibility(View.GONE);
                    rz.setVisibility(View.GONE);
                    imageButton2.setVisibility(View.GONE);
                    imageCv1.setVisibility(View.GONE);
                    imageCv2.setVisibility(View.GONE);
                    imageCv3.setVisibility(View.GONE);
                    n1.setVisibility(View.GONE);
                    n2.setVisibility(View.GONE);
                    n3.setVisibility(View.GONE);
                    n4.setVisibility(View.GONE);
                    imageBlue.setVisibility(View.GONE);
                    imageBlue_line.setVisibility(View.GONE);
                    table.setVisibility(View.GONE);
                    imagekey.setVisibility(View.GONE);
                    imagekey_table.setVisibility(View.GONE);
                    door.setVisibility(View.GONE);
                    cs.setVisibility(View.GONE);
                    down.setVisibility(View.GONE);
                    soc.setVisibility(View.GONE);
                    pas.setVisibility(View.GONE);
                    pen.setVisibility(View.GONE);
                    gus.setVisibility(View.GONE);
                    tv.setVisibility(View.GONE);
                    polka2.setVisibility(View.GONE);
                    pol.setVisibility(View.GONE);
                    polka1.setVisibility(View.GONE);
                    keyt.setVisibility(View.GONE);
                    ikey.setVisibility(View.GONE);
                    mol.setVisibility(View.GONE);
                    molotok.setVisibility(View.GONE);
                }
            }
        });
        imagekey.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                key = (key + 1) % 2;
                if(key == 1){
                }
                imagekey.setImageResource(imagek[key]);
            }
        });
        imageBlue_line.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                blueline = (blueline+ 1) % 2;
                if(blueline == 1){
                    imagekey_table.setImageResource(imaget[0]);
                    kt = 0;
                }
                imageBlue_line.setImageResource(imageb[blueline]);
            }
        });
        molotok.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ml = (ml + 1) % 2;
                if(ml == 1){
                    imageBlue_line.setImageResource(imageb[0]);
                    key = 0;
                    imagekey_table.setImageResource(imaget[0]);
                    kt = 0;
                }
                molotok.setImageResource(molot[ml]);
            }
        });
        imagekey_table.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                kt = (kt + 1) % 2;
                if(kt == 1){
                    imagekey.setImageResource(imagek[0]);
                    key = 0;
                    imageBlue_line.setImageResource(imageb[0]);
                    blueline = 0;
                }
                imagekey_table.setImageResource(imaget[kt]);
            }
        });
        imagekey_table2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                kt2 = (kt2 + 1) % 2;
                if(kt2 == 1){
                    imagekey.setImageResource(imagek[0]);
                    key = 0;
                    imageBlue_line.setImageResource(imageb[0]);
                    blueline = 0;
                    imagekey_table.setImageResource(imaget[0]);
                    kt = 0;
                }
                imagekey_table2.setImageResource(imaget[kt2]);
            }
        });
        table.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                down.setVisibility(View.VISIBLE);
                if(tb == 6)
                    pas.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                fon.setImageResource(sc[tb]);
                table.setVisibility(View.GONE);
                door.setVisibility(View.GONE);
            }
        });
        pas.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                pas.setVisibility(View.GONE);
                fon.setImageResource(sc[tb + 2]);
                pen.setVisibility(View.VISIBLE);
                n1.setVisibility(View.VISIBLE);
                n2.setVisibility(View.VISIBLE);
                n3.setVisibility(View.VISIBLE);
                n4.setVisibility(View.VISIBLE);
            }
        });
        pen.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(nm1 == 1 && nm2 == 4 && nm3 == 8 && nm4 == 7){
                    tb++;
                    fon.setImageResource(sc[tb]);
                    keyt.setVisibility(View.VISIBLE);
                    pen.setVisibility(View.GONE);
                    n1.setVisibility(View.GONE);
                    n2.setVisibility(View.GONE);
                    n3.setVisibility(View.GONE);
                    n4.setVisibility(View.GONE);
                }

            }
        });
        keyt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                keyt.setVisibility(View.GONE);
                imagekey_table2.setVisibility(View.VISIBLE);

            }
        });
        mol.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                mol.setVisibility(View.GONE);
                molotok.setVisibility(View.VISIBLE);

            }
        });
        soc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                down.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                rz.setVisibility(View.VISIBLE);
                rz.setImageResource(socket[s]);
                soc.setVisibility(View.GONE);
                cs.setVisibility(View.GONE);
                tv.setVisibility(View.GONE);
                pol.setVisibility(View.GONE);
            }
        });
        gus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                fon.setImageResource(sc[10]);
                down.setVisibility(View.VISIBLE);
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                gus.setVisibility(View.GONE);

            }
        });

    }

    public void onClick(View v) {
        screen = (screen + 1) % 4;
        fon.setImageResource(sc[screen]);
        if(screen == 0){
            if(a < 3){
                imagePocket.setVisibility(View.VISIBLE);}
            gus.setVisibility(View.GONE);
        }
        if(screen == 1){
            imagePocket.setVisibility(View.GONE);
            table.setVisibility(View.VISIBLE);
            door.setVisibility(View.VISIBLE);
        }
        if(screen == 2){
            door.setVisibility(View.GONE);
            table.setVisibility(View.GONE);
            cs.setVisibility(View.VISIBLE);
            soc.setVisibility(View.VISIBLE);
            tv.setVisibility(View.VISIBLE);
            pol.setVisibility(View.VISIBLE);
        }
        if(screen == 3){
            imagePocket.setVisibility(View.GONE);
            cs.setVisibility(View.GONE);
            gus.setVisibility(View.VISIBLE);
            tv.setVisibility(View.GONE);
            soc.setVisibility(View.GONE);
            pol.setVisibility(View.GONE);
        }
        /*try{
            Intent intent = new Intent(this, Wall1.class);
            intent.putExtra("things","OK");
            startActivity(intent);
            onPause();
        } catch (Exception e){
            e.printStackTrace();
        }*/
    }
    public void onClicks(View v) {
        screen = (screen + 3) % 4;
        fon.setImageResource(sc[screen]);
        if(screen == 0){
            if(a < 3){
                imagePocket.setVisibility(View.VISIBLE);}
            table.setVisibility(View.GONE);
            door.setVisibility(View.GONE);
        }
        if(screen == 1){
            imagePocket.setVisibility(View.GONE);
            door.setVisibility(View.VISIBLE);
            soc.setVisibility(View.GONE);
            tv.setVisibility(View.GONE);
            table.setVisibility(View.VISIBLE);
            cs.setVisibility(View.GONE);
            pol.setVisibility(View.GONE);
        }
        if(screen == 2){
            cs.setVisibility(View.VISIBLE);
            soc.setVisibility(View.VISIBLE);
            gus.setVisibility(View.GONE);
            tv.setVisibility(View.VISIBLE);
            pol.setVisibility(View.VISIBLE);
        }
        if(screen == 3){
            imagePocket.setVisibility(View.GONE);
            gus.setVisibility(View.VISIBLE);
        }
       /* try{
            Intent intent = new Intent(this, Wall3.class);
            intent.putExtra("things","OK");
            startActivity(intent);
            //finish();
        } catch (Exception e){
            e.printStackTrace();
        }*/
    }
    public void onClicker(View v) {
        if(blueline == 1){
            s++;
            rz.setImageResource(socket[s]);
            imageBlue_line.setVisibility(View.GONE);
        }

        /*try{
            Intent intent = new Intent(this, Picture.class);
            startActivity(intent);
            finish();
        } catch (Exception e){
            e.printStackTrace();
        }*/
    }
    public void onClickt(View v) {
        if(screen == 2) {
            left.setVisibility(View.VISIBLE);
            right.setVisibility(View.VISIBLE);
            down.setVisibility(View.GONE);
            fon.setImageResource(sc[screen]);
            cs.setVisibility(View.VISIBLE);
            tv.setVisibility(View.VISIBLE);
            soc.setVisibility(View.VISIBLE);
            pol.setVisibility(View.VISIBLE);
            imageButton2.setVisibility(View.GONE);
            imageCv2.setVisibility(View.GONE);
            imageCv3.setVisibility(View.GONE);
            imageCv1.setVisibility(View.GONE);
            polka1.setVisibility(View.GONE);
            polka2.setVisibility(View.GONE);
            ikey.setVisibility(View.GONE);
            mol.setVisibility(View.GONE);
            rz.setVisibility(View.GONE);
            cv = 4;
        }
        if(screen == 1) {
            left.setVisibility(View.VISIBLE);
            right.setVisibility(View.VISIBLE);
            door.setVisibility(View.VISIBLE);
            table.setVisibility(View.VISIBLE);
            down.setVisibility(View.GONE);
            fon.setImageResource(sc[screen]);
            pas.setVisibility(View.GONE);
            pen.setVisibility(View.GONE);
            n1.setVisibility(View.GONE);
            n2.setVisibility(View.GONE);
            n3.setVisibility(View.GONE);
            n4.setVisibility(View.GONE);
            polka1.setVisibility(View.GONE);
            keyt.setVisibility(View.GONE);
            polka2.setVisibility(View.GONE);

        }
        if(screen == 3) {
            left.setVisibility(View.VISIBLE);
            right.setVisibility(View.VISIBLE);
            gus.setVisibility(View.VISIBLE);
            down.setVisibility(View.GONE);
            rz.setVisibility(View.GONE);
            fon.setImageResource(sc[screen]);
        }
    }
}