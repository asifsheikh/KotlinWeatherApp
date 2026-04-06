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

**Recommended Public APIs:**
- **[Open-Meteo](https://open-meteo.com/):** Highly recommended for beginners. It is completely **free and requires no API key**. It offers a unified geocoding and weather API.
- **[OpenWeatherMap](https://openweathermap.org/api):** The industry standard for weather tutorials. It offers a `q={cityName}` endpoint which is extremely simple to hook into, though it requires registering for a free API key.

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

---

## Getting Started / Git Workflow

To keep your work organized and ensure the `main` branch remains clean, please follow these steps before you start coding:

1. **Clone the repository:**
   ```bash
   git clone git@github.com:asifsheikh/KotlinWeatherApp.git
   cd KotlinWeatherApp
   ```

2. **Create a new branch for your feature:**
   Instead of coding directly on `main`, create a new branch. Let's name it `feature/weather-app`.
   ```bash
   git checkout -b feature/weather-app
   ```

3. **Make your changes:**
   Start building the architecture (data, domain, presentation layers) following the requirements above.

4. **Commit your work periodically:**
   ```bash
   git add .
   git commit -m "Add domain and data layers for Weather features"
   ```

5. **Push your branch to GitHub:**
   ```bash
   git push -u origin feature/weather-app
   ```

6. **Open a Pull Request:**
   Once pushed, go to GitHub and open a Pull Request (PR) from your `feature/weather-app` branch into `main`. This allows us to review the code together!
