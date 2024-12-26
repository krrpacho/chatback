# Chat Application Backend

This is the backend for an anonymous chat application where users can:
- Send anonymous messages.
- Edit their messages after posting.
- Delete messages when needed.

The backend is implemented using **Spring Boot**, connected to an online database, and hosted on **Render**.

## Features
- **Message Management**: Provides APIs to create, read, update, and delete messages.
- **Anonymity**: Messages are stored without any user identification, ensuring full anonymity.
- **RESTful APIs**: Built with Spring Boot to handle client requests efficiently.

## Technologies Used
- **Spring Boot**: Framework for building the backend logic.
- **PostgreSQL**: Online database for storing messages.
- **Render**: Cloud platform for hosting the backend server.
- **Docker**: Used for containerizing the backend application for deployment.

## API Endpoints
- **GET /messages**: Fetch all messages.
- **POST /messages**: Create a new message.
- **PUT /messages/{id}**: Update an existing message.
- **DELETE /messages/{id}**: Delete a message by ID.

## Contributing

Contributions to this project are welcome! If you'd like to contribute, please follow these guidelines:
- **Fork the repository** and create a pull request with your changes.
- **Submit issues** for any bugs or feature requests.


#### The frontend: https://github.com/krrpacho/chat
