package info.diwe.mealzapp.model

import info.diwe.mealzapp.model.api.MealsWebService
import info.diwe.mealzapp.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }
}