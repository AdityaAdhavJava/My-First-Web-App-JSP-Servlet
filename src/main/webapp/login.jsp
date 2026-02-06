<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <style>
        * {
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            margin: 0;
            height: 100vh;
            background: linear-gradient(to bottom, #7b3fe4, #00c6ff);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card {
            background: #1f2a5a;
            width: 340px;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.3);
            color: white;
        }

        .card h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border-radius: 5px;
            border: none;
            outline: none;
        }

        .options {
            display: flex;
            justify-content: space-between;
            font-size: 12px;
            margin: 10px 0;
        }

        .options a {
            color: #cfd8ff;
            text-decoration: none;
        }

        .options a:hover {
            text-decoration: underline;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #2ecc71;
            border: none;
            border-radius: 5px;
            color: white;
            font-size: 15px;
            cursor: pointer;
            margin-top: 10px;
        }

        button:hover {
            background: #27ae60;
        }

        .footer {
            text-align: center;
            font-size: 11px;
            margin-top: 15px;
            color: #ddd;
        }
    </style>
</head>
<body>

<div class="card">
    <h2>Login</h2>

    <form action="login" method="post">
    <h3 style='color : red'>${msg}</h3>
        <input type="text" name="name" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>

        <div class="options">
            <label>
                <input type="checkbox"> Remember me
            </label>
            <a href="#">Forgot password?</a>
        </div>

        <button type="submit">Login</button>
    </form>

    <div class="footer">
        designed by Aditya Adhav.
    </div>
</div>

</body>
</html>