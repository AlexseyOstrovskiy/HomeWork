<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page2</title>
</head>
<body>
    <h1>Hello <%= request.getParameter("name") %></h1>
    <br>
    <p>Make you order!</p>
    <br>
    <select>
        <option value="book">Book</option>
        <option value="phone">Phone</option>
        <option value="tools">Tools</option>
        <option value="car">Car</option>
    </select>
    <br>
    <br>
    <button>Submit</button>

</body>
</html>