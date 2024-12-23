package com.firebaseapp.charlieandroidblog.utils

import android.content.res.Resources
import com.firebaseapp.charlieandroidblog.R
import com.firebaseapp.charlieandroidblog.model.Breed
import com.firebaseapp.charlieandroidblog.model.Breed4Me
import com.firebaseapp.charlieandroidblog.model.DogType
import com.firebaseapp.charlieandroidblog.model.GeneralsRequirements
import com.firebaseapp.charlieandroidblog.model.Healty
import com.firebaseapp.charlieandroidblog.model.Needs
import com.firebaseapp.charlieandroidblog.model.Separation
import com.firebaseapp.charlieandroidblog.model.ShelterType
import com.firebaseapp.charlieandroidblog.model.Training
import com.firebaseapp.charlieandroidblog.model.TrainingType

class UtilsContent {

    companion object{

        fun getDogSizeByNumber1to5(num:Int):String { //1-5
            var context = UtilContext.getContext()
            when(num){
                1->return context.getString(R.string.breed_size_1)
                2->return context.getString(R.string.breed_size_2)
                3->return context.getString(R.string.breed_size_3)
                4->return context.getString(R.string.breed_size_4)
                else->return context.getString(R.string.breed_size_5)
            }
        }

        fun getRandomBreed4meInfo(random:Int) : String{
            val id =  when(random){
                1-> R.string.random_breed1
                2-> R.string.random_breed2
                3-> R.string.random_breed3
                4-> R.string.random_breed4
                5-> R.string.random_breed5
                6-> R.string.random_breed6
                7-> R.string.random_breed7
                8-> R.string.random_breed8
                9-> R.string.random_breed9
                else-> R.string.random_breed1
            }
            return UtilContext.getContext().resources.getString(id)
        }

        fun getListTraining(): ArrayList<Training>{

            var al = ArrayList<Training>()
            al.add(Training(TrainingType.Before_Trainning,
                getTrainingTitleStringByTrainingType(TrainingType.Before_Trainning),
                getTrainingDescStringByTrainingType(TrainingType.Before_Trainning)
            ))
            al.add(Training(TrainingType.Relationship,
                getTrainingTitleStringByTrainingType(TrainingType.Relationship),
                getTrainingDescStringByTrainingType(TrainingType.Relationship)
            ))
            al.add(Training(TrainingType.Socialization,
                getTrainingTitleStringByTrainingType(TrainingType.Socialization),
                getTrainingDescStringByTrainingType(TrainingType.Socialization)
            ))
            al.add(Training(TrainingType.Boundaries,
                getTrainingTitleStringByTrainingType(TrainingType.Boundaries),
                getTrainingDescStringByTrainingType(TrainingType.Boundaries)
            ))
            al.add(Training(TrainingType.Tricks,
                getTrainingTitleStringByTrainingType(TrainingType.Tricks),
                getTrainingDescStringByTrainingType(TrainingType.Tricks)
            ))

            return al
        }

        fun getListOfBreeds(): List<Breed4Me> {
            val al = ArrayList<Breed4Me>()

            al.add(Breed4Me(
                "Labrador Retriever",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.ExerciseCompanion),
                Healty.Very,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Labrador_Retriever)
            ))

            al.add(Breed4Me(
                "German Shepherd",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.Always_family_in_Home,
                listOf(DogType.GuardDog, DogType.WatchDog, DogType.WorkingDog),
                Healty.Most,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyPhysicalTrainning)
               ,getBreedDescByBreed(Breed.German_Shepherd)
            ))

            al.add(Breed4Me(
                "Golden Retriever",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Medium_Backyard,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.ExerciseCompanion),
                Healty.Very,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Golden_Retriever)
            ))

            al.add(Breed4Me(
                "Bulldog",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.CoachPotato),
                Healty.HadSomeIssues,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingMonthly)
                ,getBreedDescByBreed(Breed.Bulldog)
            ))

            al.add(Breed4Me(
                "Poodle",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.Hypoalergenic),
                Healty.Very,
                listOf(GeneralsRequirements.Hypoalergenic, GeneralsRequirements.BrushingDaily, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Poodle)
            ))

            al.add(Breed4Me(
                "Rottweiler",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.For_to9HoursaDay,
                listOf(DogType.GuardDog, DogType.FamilyOriented, DogType.WatchDog),
                Healty.Very,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyPhysicalTrainning)
                ,getBreedDescByBreed(Breed.Rottweiler)
            ))

            al.add(Breed4Me(
                "Beagle",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Small_BackYard,
                Separation.For_to9HoursaDay,
                listOf(DogType.ExerciseCompanion, DogType.FamilyOriented),
                Healty.Most,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Beagle)
            ))

            al.add(Breed4Me(
                "French Bulldog",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.FamilyOriented),
                Healty.BadHealth,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingMonthly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.French_Bulldog)
            ))

            al.add(Breed4Me(
                "Dachshund",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.WatchDog),
                Healty.KindOf,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Dachshund)
            ))

            al.add(Breed4Me(
                "Siberian Husky",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.For_to9HoursaDay,
                listOf(DogType.ExerciseCompanion, DogType.WorkingDog),
                Healty.Most,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyPhysicalTrainning)
                ,getBreedDescByBreed(Breed.Siberian_Husky)
            ))

            al.add(Breed4Me(
                "Border Collie",
                getBreedNeedsByNeed(Needs.NeedsAJobs),
                ShelterType.Farm_type,
                Separation.One_to_3HoursDay,
                listOf(DogType.WorkingDog, DogType.ExerciseCompanion),
                Healty.Most,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.DailyPhysicalTrainning, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Border_Collie)
            ))

            al.add(Breed4Me(
                "Cocker Spaniel",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.CompanyDog),
                Healty.KindOf,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Cocker_Spaniel)
            ))

            al.add(Breed4Me(
                "Shih Tzu",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.FamilyOriented),
                Healty.HadSomeIssues,
                listOf(GeneralsRequirements.Hypoalergenic, GeneralsRequirements.BrushingDaily, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Shih_Tzu)
            ))

            al.add(Breed4Me(
                "Australian Shepherd",
                getBreedNeedsByNeed(Needs.NeedsAJobs),
                ShelterType.Farm_type,
                Separation.One_to_3HoursDay,
                listOf(DogType.WorkingDog, DogType.ExerciseCompanion),
                Healty.Most,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.DailyPhysicalTrainning, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Australian_Shepherd)
            ))

            al.add(Breed4Me(
                "Chihuahua",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.Always_family_in_Home,
                listOf(DogType.CompanyDog),
                Healty.KindOf,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingMonthly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Chihuahua)
            ))

            al.add(Breed4Me(
                "Great Dane",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Medium_Backyard,
                Separation.For_to9HoursaDay,
                listOf(DogType.GuardDog, DogType.FamilyOriented),
                Healty.KindOf,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Great_Dane)
            ))

            al.add(Breed4Me(
                "Yorkshire Terrier",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.Hypoalergenic),
                Healty.Most,
                listOf(GeneralsRequirements.Hypoalergenic, GeneralsRequirements.BrushingDaily, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Yorkshire_Terrier)
            ))

            al.add(Breed4Me(
                "Mixed Breed (Mutt)",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.CompanyDog),
                Healty.KindOf,
                listOf(GeneralsRequirements.MediumSheeding, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Mutt)
            ))

            al.add(Breed4Me(
                "Bichon Frise",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.FamilyOriented),
                Healty.Very,
                listOf(GeneralsRequirements.Hypoalergenic, GeneralsRequirements.BrushingDaily, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Bischon_Frise)
            ))

            al.add(Breed4Me(
                "Bernese Mountain Dog",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.WorkingDog),
                Healty.KindOf,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.BrushingWeekly, GeneralsRequirements.DailyPhysicalTrainning)
                ,getBreedDescByBreed(Breed.Bernese_Mountain)
            ))

            al.add(Breed4Me(
                "Maltese",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.One_to_3HoursDay,
                listOf(DogType.CompanyDog, DogType.FamilyOriented),
                Healty.KindOf,
                listOf(GeneralsRequirements.Hypoalergenic, GeneralsRequirements.BrushingDaily, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Maltese)
            ))

            al.add(Breed4Me(
                "Corgi",
                getBreedNeedsByNeed(Needs.Moderate),
                ShelterType.Medium_Backyard,
                Separation.One_to_3HoursDay,
                listOf(DogType.FamilyOriented, DogType.WorkingDog),
                Healty.Most,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.DailyWalks)
                ,getBreedDescByBreed(Breed.Corgi)
            ))

            al.add(Breed4Me(
                "Chow Chow",
                getBreedNeedsByNeed(Needs.Medium),
                ShelterType.Medium_Backyard,
                Separation.For_to9HoursaDay,
                listOf(DogType.GuardDog, DogType.WatchDog),
                Healty.Most,
                listOf(GeneralsRequirements.SheedingALot, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Chow)
            ))

            al.add(Breed4Me(
                "Doberman",
                getBreedNeedsByNeed(Needs.High),
                ShelterType.Medium_Backyard,
                Separation.One_to_3HoursDay,
                listOf(DogType.GuardDog, DogType.WatchDog),
                Healty.Most,
                listOf(GeneralsRequirements.DailyPhysicalTrainning, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Doberman)
            ))

            al.add(Breed4Me(
                "Bischon_Frise",
                getBreedNeedsByNeed(Needs.Low),
                ShelterType.Apartment,
                Separation.Always_family_in_Home,
                listOf(DogType.FamilyOriented, DogType.CompanyDog),
                Healty.Most,
                listOf(GeneralsRequirements.BrushingWeekly, GeneralsRequirements.MentalTraining)
                ,getBreedDescByBreed(Breed.Bischon_Frise)
            ))

            // Add 20-30 more breeds based on the same pattern, balancing diversity in needs, health, and requirements
            return al
        }

        fun getBreedDescByBreed(breed: Breed):String{
           val res = when(breed){
               Breed.Beagle -> UtilContext.getContext().getString(R.string.breed_beagle)
               Breed.Labrador_Retriever -> UtilContext.getContext().getString(R.string.breed_labrador)
               Breed.German_Shepherd -> UtilContext.getContext().getString(R.string.breed_german)
               Breed.Golden_Retriever -> UtilContext.getContext().getString(R.string.breed_bulldog)
               Breed.Poodle -> UtilContext.getContext().getString(R.string.breed_poodle)
               Breed.Rottweiler -> UtilContext.getContext().getString(R.string.breed_rottweiler)
               Breed.French_Bulldog -> UtilContext.getContext().getString(R.string.breed_french_bulldog)
               Breed.Dachshund -> UtilContext.getContext().getString(R.string.breed_dachshund)
               Breed.Siberian_Husky -> UtilContext.getContext().getString(R.string.breed_husky)
               Breed.Border_Collie -> UtilContext.getContext().getString(R.string.breed_border)
               Breed.Cocker_Spaniel -> UtilContext.getContext().getString(R.string.breed_spaniel)
               Breed.Shih_Tzu -> UtilContext.getContext().getString(R.string.breed_shih_tzu)
               Breed.Australian_Shepherd -> UtilContext.getContext().getString(R.string.breed_australian_shepherd)
               Breed.Chihuahua -> UtilContext.getContext().getString(R.string.breed_chihuahua)
               Breed.Great_Dane -> UtilContext.getContext().getString(R.string.breed_dane)
               Breed.Yorkshire_Terrier -> UtilContext.getContext().getString(R.string.breed_yorkshire_terrier)
               Breed.Mutt -> UtilContext.getContext().getString(R.string.breed_mutt)
               Breed.Bernese_Mountain -> UtilContext.getContext().getString(R.string.breed_bernese)
               Breed.Maltese -> UtilContext.getContext().getString(R.string.breed_maltese)
               Breed.Corgi -> UtilContext.getContext().getString(R.string.breed_corgi)
               Breed.Doberman ->  UtilContext.getContext().getString(R.string.breed_doberman)
               Breed.Chow ->  UtilContext.getContext().getString(R.string.breed_chow)
               Breed.Bulldog -> UtilContext.getContext().getString(R.string.breed_bulldog)
               Breed.Bischon_Frise ->UtilContext.getContext().getString(R.string.breed_bichon)
            }
            return res
        }

        fun getTrainingTitleStringByTrainingType(type: TrainingType):String{
            val res = when(type){
                TrainingType.Before_Trainning -> UtilContext.getContext().getString(R.string.training_before_training_title)
                TrainingType.Boundaries -> UtilContext.getContext().getString(R.string.training_boundaries_title)
                TrainingType.Relationship -> UtilContext.getContext().getString(R.string.training_boundaries_title)
                TrainingType.Socialization -> UtilContext.getContext().getString(R.string.training_socialization_title)
                TrainingType.Tricks -> UtilContext.getContext().getString(R.string.training_tricks_title)
            }
            return res
        }

        fun getTrainingDescStringByTrainingType(type: TrainingType):String{
            val res = when(type){
                TrainingType.Before_Trainning -> UtilContext.getContext().getString(R.string.training_before_training_details)
                TrainingType.Boundaries -> UtilContext.getContext().getString(R.string.training_boundaries_details)
                TrainingType.Relationship -> UtilContext.getContext().getString(R.string.training_boundaries_details)
                TrainingType.Socialization -> UtilContext.getContext().getString(R.string.training_socialization_details)
                TrainingType.Tricks -> UtilContext.getContext().getString(R.string.training_tricks_details)
            }
            return res
        }

        fun getBreedNeedsByNeed(n : Needs):String{
            val res = when(n){
                Needs.Low -> UtilContext.getContext().getString(R.string.needs_low)
                Needs.Moderate -> UtilContext.getContext().getString(R.string.needs_moderate)
                Needs.Medium -> UtilContext.getContext().getString(R.string.needs_medium)
                Needs.High -> UtilContext.getContext().getString(R.string.needs_high)
                Needs.NeedsAJobs -> UtilContext.getContext().getString(R.string.needs_job)
            }

            return res
        }

        fun getListFoods(): ArrayList<Array<String>>{
            val aGoodFoods = UtilContext.getContext().resources.getStringArray(R.array.good_foods)
            val aBadFoods = UtilContext.getContext().resources.getStringArray(R.array.bad_foods)
            aBadFoods.sort()
            aGoodFoods.sort()
            val al = ArrayList<Array<String>>()
            al.add(aGoodFoods)
            al.add(aBadFoods)
            return al
        }


        fun getListOfBeforeGettingADog():ArrayList<Pair<String,String>>{
            val al = ArrayList<Pair<String,String>>()

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title1),
                UtilContext.getContext().getString(R.string.before_detail1)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title2),
                UtilContext.getContext().getString(R.string.before_detail2)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title3),
                UtilContext.getContext().getString(R.string.before_detail3)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title4),
                UtilContext.getContext().getString(R.string.before_detail4)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title5),
                UtilContext.getContext().getString(R.string.before_detail5)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title6),
                UtilContext.getContext().getString(R.string.before_detail6)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title7),
                UtilContext.getContext().getString(R.string.before_detail7)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title8),
                UtilContext.getContext().getString(R.string.before_detail8)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title9),
                UtilContext.getContext().getString(R.string.before_detail9)))

            al.add(Pair(
                UtilContext.getContext().getString(R.string.before_title10),
                UtilContext.getContext().getString(R.string.before_detail10)))

            return al
        }

        fun getListOfDoAndDont():ArrayList<Pair<String,String>>{
            val al = ArrayList<Pair<String,String>>()

            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_title1),
                UtilContext.getContext().getString(R.string.do_details1)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_title2),
                UtilContext.getContext().getString(R.string.do_details2)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_title3),
                UtilContext.getContext().getString(R.string.do_details3)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_title4),
                UtilContext.getContext().getString(R.string.do_details4)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_title5),
                UtilContext.getContext().getString(R.string.do_details5)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_not_title1),
                UtilContext.getContext().getString(R.string.do_not_details1)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_not_title2),
                UtilContext.getContext().getString(R.string.do_not_details2)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_not_title3),
                UtilContext.getContext().getString(R.string.do_not_details3)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_not_title4),
                UtilContext.getContext().getString(R.string.do_not_details4)
            ))
            al.add(Pair(
                UtilContext.getContext().getString(R.string.do_not_title5),
                UtilContext.getContext().getString(R.string.do_not_details5)
            ))


            return al
        }

        fun getSubtitleByIndex(i: Int):String {
            val res = if (i == 0) "Do" else "Dont"
            return res
        }

        fun getTitleFoodByIndex(i: Int):String {
            val context = UtilContext.getContext()
            val res = if (i == 0) context.getString(R.string.good_food) else context.getString(R.string.bad_food)
            return res
        }

    }


}