package com.firebaseapp.charlieandroidblog.model

data class Breed4Me(
    val name:String,
    val exerciseNeeds: String,
    val lifeTypeAdapt: ShelterType,
    val separation : Separation,
    val type: List<DogType>,
    val healthy: Healty,
    val requirements: List<GeneralsRequirements>,
    val whoShouldOwn:String
)

enum class Needs{
    Low, Moderate, Medium, High, NeedsAJobs
}

enum class ShelterType{
    Apartment, Small_BackYard, Medium_Backyard, Farm_type
}

enum class Separation{
    Always_family_in_Home, One_to_3HoursDay, For_to9HoursaDay, Few_Hours_For_Week
}

enum class DogType{
    WatchDog, GuardDog, FamilyOriented, WorkingDog, CompanyDog, ExerciseCompanion, WatterDog, CoachPotato,
    Hypoalergenic
}

enum class Healty{
    Most, Very, KindOf, HadSomeIssues, BadHealth
}

enum class GeneralsRequirements{
    SheedingALot, MediumSheeding, Hypoalergenic, BrushingDaily, BrushingWeekly, BrushingMonthly,
    DailyWalks, MentalTraining, DailyPhysicalTrainning
}

