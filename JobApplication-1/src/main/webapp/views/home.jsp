<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="style3.css"> <!-- Include your custom CSS file -->
    <style>
        /* Ensure buttons are visible */
        .btn-primary {
            color: #fff;
            background-color: #007bff;
            border-color: #007bff;
            margin:7px
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }

        /* Navbar button styling */
        .navbar-nav {
            display: flex;
            justify-content: space-between;
            align-items: center; /* Align items vertically */
        }

        .nav-link {
            padding: 0.5rem 1rem;
            margin: 0 1rem; /* Add margin between buttons */
            border-radius: 0.25rem;
        }

        .nav-link:hover {
            background-color: #007bff;
            color: #fff;
        }

        .nav-link:focus {
            outline: none;
        }

        /* Animation for title */
        .job-portal-title {
            text-transform: uppercase;
            animation: bounce 2s infinite;
        }

        @keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                transform: translateY(0);
            }
            40% {
                transform: translateY(-30px);
            }
            60% {
                transform: translateY(-15px);
            }
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12 text-center">
            <div class="job-portal-title bg-blue-500 text-white rounded-full px-4 py-2 mt-5 mx-auto">
                <h1 class="text-4xl font-bold">JOB PORTAL</h1>
            </div>
        </div>
    </div>
</div>

<nav class="navbar navbar-expand-lg navbar-light bg-clr">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link btn btn-primary" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link btn btn-primary" href="contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row">
        <!-- Card 1 -->
        <div class="col-md-6 mb-5">
            <div class="view-stocks-card"> <!-- Apply the class for View Stocks card -->
                <div class="card-body text-center">
                    <h5 class="card-title">Login as Job Seeker</h5>
                    <div class="d-flex justify-content-between">
                        <form action="/login/jobseeker" method="get">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </form>
                        <form action="/signup/jobseeker" method="get">
                            <button type="submit" class="btn btn-primary">Sign Up</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Card 2 -->
        <div class="col-md-6 mb-5">
            <div class="add-item-card"> <!-- Apply the class for Add Item card -->
                <div class="card-body text-center">
                    <h5 class="card-title">Login as Job Giver</h5>
                    <div class="d-flex justify-content-between">
                        <form action="/login/jobgiver" method="get">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </form>
                        <form action="/signup/jobgiver" method="get">
                            <button type="submit" class="btn btn-primary">Sign Up</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
