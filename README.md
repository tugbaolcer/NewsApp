# NewsApp

**NewsApp** is an Android application that provides users with the latest news from various categories. This app is built using modern Android development technologies, including Jetpack components and Clean Architecture.

## Preview

![news_onboarding](https://github.com/user-attachments/assets/dc84e85f-16be-47e0-a755-6357d4c5d6f0)

![news1](https://github.com/user-attachments/assets/ee455344-eaf8-41ce-9462-28b0a4000042)

![news2](https://github.com/user-attachments/assets/6fd778a2-ce3c-4149-a982-807c83509b6a)


## Features

- Browse the latest news articles.
- Filter news by categories such as technology, sports, entertainment, etc.
- Save favorite articles for later reading.
- Share articles via social media or messaging apps.
- Offline support: view saved articles even when you're offline.
- Supports light and dark themes.

## Technologies Used

- **Kotlin**: Programming language.
- **Jetpack Compose**: For building UI components declaratively.
- **Retrofit**: For network requests to fetch news data.
- **Room**: Local database to store favorite articles.
- **Coroutines**: For managing background tasks.
- **ViewModel**: To handle UI-related data in a lifecycle-conscious way.
- **Hilt**: Dependency injection framework for managing dependencies.

## Installation

To run the project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/tugbaolcer/NewsApp.git
   ```

2. Open the project in Android Studio.

3. Make sure to sync the project with Gradle files.

4. Add your API key for the news service (if required) in the  `local.properties` or directly in the code:
     ```properties
   API_KEY="your_api_key"
   ```
5. Run the project on an emulator or a physical device.

## Architecture
This project follows the Clean Architecture pattern with separation of concerns across layers:

1. Data Layer: Manages data from local (Room) and remote (Retrofit) sources.
2. Domain Layer: Contains business logic and use cases.
3. Presentation Layer: Handles the UI with Jetpack Compose, and ViewModels to interact with the domain layer.

   
## Contributing
If you'd like to contribute to this project, feel free to submit a pull request or open an issue.
   


