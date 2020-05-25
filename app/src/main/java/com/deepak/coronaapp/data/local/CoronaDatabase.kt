package com.deepak.coronaapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [CountryStat::class, FavoriteCountry::class], version = 1)
abstract class CoronaDatabase: RoomDatabase() {

    abstract fun countryDao(): CountryDao
}