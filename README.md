# NewsApp
An Android app built with Jetpack Compose and the latest android libraries.


## Features

- **Modern Architecture**: Clean Architecture (Data, Domain, Presentation layers) coupled with MVVM.
- **UI Toolkit**: 100% Jetpack Compose.
- **Dependency Injection**: Dagger Hilt for robust dependency management.
- **Networking**: Retrofit2 for fetching data from the news API.
- **Pagination**: Paging 3 integration for seamless scrolling and loading of news articles.
- **Local Storage**: 
  - Room Database for bookmarking and saving favorite news articles.
  - Preferences DataStore for managing onboarding states and local user preferences.
- **Navigation**: Jetpack Compose Navigation for fluid transitions between screens (Onboarding, Home, Search, Bookmark, Details).
- **Image Loading**: Coil for efficient remote image fetching and rendering.
- **Splash Screen**: AndroidX Splash Screen API for a polished startup experience.
- **UI Enhancements**: 
  - Shimmer effects during data loading.
  - Accompanist System UI Controller for customizing the system bars.

## Project Structure

```text
app/src/main/java/com/loc/newsapp/
├── data/                       # Data Layer (Network, Local Database, Repository Implementations)
│   ├── di/                     # Dependency Injection modules (AppModule)
│   ├── local/                  # Room Database (Dao, Database, TypeConverters)
│   ├── manager/                # Implementations of managers (e.g., LocalUserManager)
│   ├── remote/                 # Retrofit API, PagingSources, DTOs
│   └── repository/             # Repository pattern implementations
├── domain/                     # Domain Layer (Models, Repositories, Use Cases)
│   ├── manager/                # Interfaces for DataStore/local managers
│   ├── model/                  # Core data models (Article, Source)
│   ├── repository/             # Repository interfaces
│   └── usecases/               # Encapsulated business logic (e.g., GetNews, SaveAppEntry)
├── presentation/               # Presentation Layer (UI, ViewModels, States, Events)
│   ├── bookmark/               # Bookmark Screen
│   ├── common/                 # Reusable Compose UI components (ArticleCard, SearchBar, ShimmerEffect)
│   ├── details/                # Details Screen for individual articles
│   ├── home/                   # Home Screen showing paged news
│   ├── navgraph/               # Compose Navigation configuration and routes
│   ├── news_navigator/         # Main container handling BottomNavigation
│   ├── onboarding/             # Onboarding flow for first-time users
│   └── search/                 # Search Screen for querying news
├── ui/theme/                   # Compose Themes, Colors, and Typography
├── util/                       # Utilities and Constants
├── MainActivity.kt             # Single-Activity entry point
└── NewsApplication.kt          # Application class for Hilt initialization
```

# Preview 
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/0ba957e5-8b70-42d6-ab09-2cf38ba3936e"><br>
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/6dda119b-1b3f-4637-91a4-314b85eda214"><br>
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/6e7186fa-9c05-4705-b568-8326cc99c17f"><br>
<br>
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/90385dcf-a852-47c2-be23-aa243adb12e8"><br>
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/63e8be30-6de8-4060-9ce2-0fa5000c95b8"><br>
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/0382d92a-e965-4bb3-a1f4-d82c0da87f94"><br>
<br><br>
# Technologies i used to build this app
<img width="716" alt="Screenshot 2023-08-23 at 4 11 00 PM" src="https://github.com/mohammednawas8/NewsApp/assets/78867217/f9e80bb2-f066-4b90-a537-55d4e0bf07ca">

> **Credits:** This app was built by following a comprehensive tutorial. I am not the original creator of this project. All proper credits for the original concept, design, and tutorial go to the actual owner.
>
> To learn how to build this app from scratch, you can watch their original playlist on YouTube: https://www.youtube.com/playlist?list=PLzZEuVaFb9Exi-pc8qtHBrrLg8bUn-TP6
