
# Travel Itinerary Planner Pro

Travel Itinerary Planner Pro is an all-in-one, AI-powered travel dashboard designed to redefine travel planning. It moves beyond simple spreadsheets by offering a seamless, intelligent, and dynamic platform to create, manage, and cherish your travel memories.

This repository contains the full-stack application, including the **Java Spring Boot Backend** and the **Vanilla JavaScript Frontend**.

-----

## 🚀 Core Features

  * **AI Itinerary Generation:** Leverages the Groq API with the Llama 3.1 model to provide intelligent, context-aware travel suggestions, from landmarks to local cuisine.
  * **Dynamic Timeline Planner:** A visually intuitive timeline interface to add, organize, and manage daily activities with specific timings and notes.
  * **Full CRUD Functionality:** Save new itineraries, fetch all saved trips, and delete itineraries with persistent storage.
  * **Travel Journal & Photo Gallery:** Capture memories by adding daily notes and uploading photos directly to your itinerary, creating a rich travel log.
  * **PDF Export:** Download a beautifully formatted, offline-ready PDF of your complete itinerary using `jsPDF` and `html2canvas`.
  * **Integrated Dashboard:** Features a real-time currency converter and an interactive map placeholder.
  * **Modern UI/UX:** A sleek, responsive interface built with **Tailwind CSS**, featuring smooth scroll animations (AOS) and a dark/light mode toggle.

-----

## 🛠️ Technology Stack

This project is separated into two main components: a backend REST API and a frontend client.

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Backend** | **Java 11** | Core programming language. |
| | **Spring Boot 2.7.5** | Framework for creating the robust RESTful API. |
| | **Spring Data JPA** | For data persistence and repository management. |
| | **Spring Web** | For building web-based controllers. |
| | **Maven** | Dependency management and project build. |
| **Database** | **H2 In-Memory** | Lightweight, in-memory database for development. |
| **Frontend**| **Vanilla JavaScript (ES6+)** | For all client-side logic, API fetching, and DOM manipulation. |
| | **Tailwind CSS** | Utility-first CSS framework for rapid UI development. |
| | **AOS (Animate on Scroll)** | For subtle scroll animations. |
| | **jsPDF & html2canvas** | For client-side PDF generation. |
| **APIs** | **Groq API (Llama 3.1)** | External API for AI-powered suggestions. |

-----

## 🏁 Getting Started

### Prerequisites

  * **Java 11** (JDK 11)
  * **Maven** (can use the included Maven Wrapper `mvnw`)
  * A **Groq API Key** for AI features.
  * A modern web browser (e.g., Chrome, Firefox).
  * A tool to run a local server for the frontend (like the **Live Server** extension for VS Code).

### Backend Setup (Spring Boot)

1.  **Clone the repository:**

    ```sh
    git clone <your-repository-url>
    cd <repository-name>
    ```

2.  **Navigate to the backend directory:**

    ```sh
    cd TravelPlanner-Backend
    ```

3.  **Run the application using the Maven Wrapper:**

      * On macOS/Linux:
        ```sh
        ./mvnw spring-boot:run
        ```
      * On Windows:
        ```sh
        .\mvnw.cmd spring-boot:run
        ```

4.  **Backend is now running\!**

      * The API will be live at `http://localhost:8080`.
      * You can access the H2 in-memory database console at `http://localhost:8080/h2-console`.
      * **H2 Console Settings:**
          * **Driver Class:** `org.h2.Driver`
          * **JDBC URL:** `jdbc:h2:mem:travel_planner_db`
          * **User Name:** `sa`
          * **Password:** `password`

### Frontend Setup (Vanilla JS)

1.  **Get your Groq API Key:**

      * Go to the [Groq website](https://groq.com/) and sign up to get a free API key.

2.  **Add the API Key:**

      * Open the `TravelPlanner-Frontend/index.html` file.
      * Find the following line in the `<script>` tag at the bottom:
        ```javascript
        const GROQ_API_KEY = "YOUR_GROQ_API_KEY"; // IMPORTANT: Replace with your Groq API key
        ```
      * Replace `"YOUR_GROQ_API_KEY"` with your actual Groq key.

3.  **Run the frontend:**

      * The backend's CORS policy is configured to accept requests from `http://127.0.0.1:5500`.
      * The easiest way to run the frontend is using the **Live Server** extension in Visual Studio Code.
      * Right-click `index.html` and select "Open with Live Server".
      * This will automatically open the application in your browser at `http://127.0.0.1:5500`.

4.  **All set\!** You can now use the application.

-----

## 🗄️ API Endpoints

The backend exposes the following RESTful endpoints under the base URL `http://localhost:8080/api/itineraries`.

| Method | Endpoint | Description | Request Body (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/` | Fetches all saved itineraries. | None |
| `POST` | `/` | Saves a new itinerary. | `Itinerary` object |
| `DELETE`| `/{id}` | Deletes an itinerary by its ID. | None |

### `Itinerary` Model

The `Itinerary` object has the following structure:

```json
{
  "id": 1, // Auto-generated
  "destination": "Swiss Alps",
  "startDate": "2024-12-20",
  "endDate": "2024-12-25",
  "dayPlans": "[{\"date\":\"2024-12-20\",\"activities\":[{\"time\":\"09:00\",\"description\":\"Arrive in Zurich\"}]}]" // JSON string
}
```

-----

## 🧑‍💻 Meet the Architects

This project was brought to life by a dedicated team:

  * **Yadav Ishita Anilkumar Sumitra (Team Lead & Full-Stack Architect):**
    The visionary behind the project. Ishita architected both frontend and backend systems, built the entire Spring Boot REST API, engineered the dynamic JavaScript frontend, designed the UI with Tailwind CSS, and integrated all third-party APIs.

  * **Yadav Aditya Karamljeet Maina (Backend & Database Specialist):**
    Aditya played a crucial role in ensuring the backend's stability and reliability. He focused on testing the API endpoints and validating the data persistence layer to guarantee data integrity.

  * **Yadav Ayush Vinay Sunita (Frontend & UI Specialist):**
    Ayush was instrumental in crafting the polished user interface. He translated design concepts into responsive, functional components and ensured a consistent visual experience across the application.

-----

## 📄 License

This project is licensed under the **Apache License 2.0**.
