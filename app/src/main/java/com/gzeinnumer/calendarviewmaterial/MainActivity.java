package com.gzeinnumer.calendarviewmaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<EventDay> events = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        events.add(new EventDay(calendar, R.drawable.sample_icon));
        events.add(new EventDay(calendar, R.drawable.sample_icon, Color.parseColor("#228B22")));

        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setEvents(events);

        calendarView.setOnDayClickListener(eventDay -> {
            Calendar clickedDayCalendar = eventDay.getCalendar();
        });
    }
}
