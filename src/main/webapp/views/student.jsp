<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Students</title>
</head>
<body>
    <h1>Student List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <h2>Add a New Student</h2>
    <form action="students" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" required>
        <label for="age">Age:</label>
        <input type="number" name="age" required>
        <input type="submit" value="Add Student">
    </form>
</body>
</html>
