## OJ System

**OJ System** (Online Judgement System) is a web-based platform designed to provide an efficient and scalable solution for automating coding challenges and evaluations. The system allows users to submit code solutions, which are then automatically judged against predefined test cases to ensure correctness and efficiency.

**Status**: Still Updating

## Features

- **Online Code Submission**: Users can submit their code in multiple programming languages.
- **Automated Judging**: Submitted solutions are automatically evaluated using predefined test cases.
- **Score and Feedback**: feedback on code submissions, with detailed error reporting and scoring.
- **User Management**: Separate user accounts for administrators, participants, and problem setters.

## Project Structure

- **Backend**: Built with Java, Spring Boot, and Alibaba SpringCloud, the backend handles user requests, authentication, and the core functionality of the Online Judgement system.
  
- **Frontend**: The frontend is developed with Vue.js, providing users with an interactive interface to submit coding challenges, view results, and track progress.

- **CodeSandbox**: The CodeSandbox is responsible for compiling and running user-submitted code in an isolated environment. It is implemented using Java.

## Tech Stack

- **Backend**:
  - Java
  - Spring Boot
  - Alibaba SpringCloud

- **Frontend**:
  - Vue.js
  - HTML/CSS
  - JavaScript

- **CodeSandbox**:
  - Java

## Installation and Setup

### Backend
1. Clone the repository and navigate to the `backend` directory.
2. Build the Spring Boot application:
   ```bash
   ./mvnw clean install
   ....
