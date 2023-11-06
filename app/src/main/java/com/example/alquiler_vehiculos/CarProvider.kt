package com.example.alquiler_vehiculos

class CarProvider {
    companion object{
        val carList = listOf<Car>(

            Car(
                photo = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "Carrozado con trampilla",
                plazas = 3,
                capacidad = "20M3"
            ),

            Car(
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg",
                modelo = "Carrozado sin trampilla",
                plazas = 3,
                capacidad = "20M3"
            ),

            Car(
                photo = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg",
                modelo = "Furgoneta grande",
                plazas = 3,
                capacidad = "15M3"
            ),

            Car(
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg",
                modelo = "Furgoneta mediana",
                plazas = 3,
                capacidad = "8M3"
            ),

            Car(
                photo = "https://blanauto.com/sites/default/files/2019-08/Nissan-Navara-NP-3001-1900x1102_c.jpg",
                modelo = "Furgoneta pequeña",
                plazas = 2,
                capacidad = "4M3"
            )
        )
    }
}