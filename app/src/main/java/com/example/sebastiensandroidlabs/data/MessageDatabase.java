package com.example.sebastiensandroidlabs.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ChatMessage.class}, version = 3)
public abstract class MessageDatabase extends RoomDatabase {


    public abstract ChatMessageDAO cmDAO();

}
