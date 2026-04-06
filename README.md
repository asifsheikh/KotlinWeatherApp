# WeatherMentor Starter Project

This project acts as a learning template for an Android development mentee. Your task is to build out a simple weather app by following the architecture and requirements outlined below. The project is mostly empty, and you are expected to implement the missing components.

## Requirements

### 1. Architecture
- Follow a clean architecture-inspired structure:
  - `data/`
  - `domain/`
  - `presentation/`
- Use the **MVVM pattern**.
- Keep it simple (no overengineering).

### 2. Features
Implement a single screen where the user can:
- Enter a city name.
- Tap a "Get Weather" button.

Manage and display 3 UI states:
- Loading
- Success (with placeholder weather data initially, and real data later)
- Error

### 3. Networking
- Set up **Retrofit** (or Ktor).
- Add an interface for the weather API.
- Create the data transfer objects (DTOs) for the network response.

### 4. Domain Layer
- Create a `Weather` model representing the domain data.
- Create a `GetWeatherUseCase` class to fetch the data.

### 5. Data Layer
- Create a `WeatherRepository` interface in the domain layer.
- Create a fake/mock implementation of the repository returning dummy data. Later, replace this with a real network call implementation.

### 6. Presentation
- Create a `ViewModel` managing state via `StateFlow`.
- Represent your UI state using a `sealed class` (Loading, Success, Error).
- Build the Compose UI with a `TextField` for city input, a `Button`, and a section to display the results or errors.

### 7. Coroutines
- Use `viewModelScope` to launch Coroutines for data fetching.
- Ensure all IO operations happen on the correct dispatchers.

### 8. Dependency Injection
- Manually inject dependencies for now (e.g., passing use cases to the ViewModel factory). 
- Leave comments/TODOs indicating where a DI framework like Hilt or Dagger should be introduced later.

### 9. Learning Constraints
- Start by implementing the fake/placeholder repository first to get the UI wired up.
- Code should be idiomatic Kotlin.
- Do not implement a database (e.g. Room).
- Keep everything beginner-friendly and well-documented.
