package com.example.vijay.medpal;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thy);

        TextView tv1 = (TextView) findViewById(R.id.n1);
        tv1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent in = new Intent(thy.this, presm.class);
                                       startActivity(in);
                                   }
                               }

        );

        TextView tv2 = (TextView) findViewById(R.id.e1);
        tv2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent in = new Intent(thy.this, presm.class);
                                       startActivity(in);
                                   }
                               }

        );

        Button khan = (Button)findViewById(R.id.o2);
        khan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(thy.this, presm.class);
                startActivity(in);
            }
        });
    }

    public void notifp(View v) {
        createNotification();
    }


    public void createNotification() {
        Intent intent = new Intent(thy.this, p1.class);
        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(getApplicationContext());
        taskStackBuilder.addParentStack(presm.class);
        taskStackBuilder.addNextIntent(intent);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(1, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder nbuilder = new NotificationCompat.Builder(this);
        nbuilder.setContentTitle("MEDPAL");
        nbuilder.setContentText("The Patient has UPTADED his test Results");
        nbuilder.setSmallIcon(R.drawable.ic_stat_name);
        nbuilder.setContentIntent(pendingIntent);

        nbuilder.setDefaults(Notification.DEFAULT_SOUND);
        nbuilder.setVibrate(new long[]{100, 750, 100, 750});
        nbuilder.setLights(Color.BLUE, 500, 300);
        Notification notification = nbuilder.build();
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(1, notification);


    }
}
