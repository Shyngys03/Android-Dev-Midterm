package com.example.aviatickets.model.service

import com.example.aviatickets.model.entity.Airline
import com.example.aviatickets.model.entity.Flight
import com.example.aviatickets.model.entity.Location
import com.example.aviatickets.model.entity.Offer
import java.util.UUID

object FakeService {

    val offerList = listOf(
        Offer(
            id = UUID.randomUUID().toString(),
            price = 24550,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "20:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "22-30",
                flightNumber = "981",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC"
                ),
                duration = 120
            ),
            airlineLogoUrl = "https://media.istockphoto.com/id/155439315/photo/passenger-airplane-flying-above-clouds-during-sunset.jpg?s=612x612&w=0&k=20&c=LJWadbs3B-jSGJBVy9s0f8gZMHi2NvWFXa3VJ2lFcL0="
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 16250,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "16:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "18-00",
                flightNumber = "991",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC"
                ),
                duration = 120
            ),
            airlineLogoUrl = "https://media.istockphoto.com/id/955952680/photo/passengers-commercial-airplane-flying-above-clouds.jpg?s=612x612&w=0&k=20&c=9bZsGq8-uZaPXR1lCztXur4JRlI1gNksYOOSZzfXPAA="
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 8990,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "09:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "11-10",
                flightNumber = "445",
                airline = Airline(
                    name = "FlyArystan",
                    code = "KC"
                ),
                duration = 100
            ),
            airlineLogoUrl = "https://media.istockphoto.com/id/155380716/photo/commercial-jet-flying-over-clouds.jpg?s=612x612&w=0&k=20&c=idhnJ7ZdrLA1Dv5GO2R28A8WCx1SXCFVLu5_2cfdvXw="
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 14440,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "14:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "16-00",
                flightNumber = "223",
                airline = Airline(
                    name = "SCAT Airlines",
                    code = "DV"
                ),
                duration = 90
            ),
            airlineLogoUrl = "https://media.istockphoto.com/id/1205116066/photo/many-flying-business-documents-isolated-on-black-background-papers-flying-in-air-in-business.jpg?s=612x612&w=0&k=20&c=s3Mu0siEY1NP4URDQ1UrQEZ7RKAOOIvvzMHZ0V7mnE0="
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 15100,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "18:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "20:15",
                flightNumber = "171",
                airline = Airline(
                    name = "QazaqAir",
                    code = "IQ"
                ),
                duration = 135
            ),
            airlineLogoUrl = "https://media.istockphoto.com/id/486836087/photo/business-travel.jpg?s=612x612&w=0&k=20&c=B2jcARGGKEQBsc4sl9unuKd9FlkjUkl3jD6MsXYH5Ac="
        )
    )
}