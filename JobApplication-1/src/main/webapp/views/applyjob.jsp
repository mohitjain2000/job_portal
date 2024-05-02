<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Application Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="mt-5 mb-4 text-center">Job Application Form</h1>
    <form action="/">
        <div class="mb-3">
            <label for="fullName" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="fullName" name="fullName" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="mb-3">
            <label for="resume" class="form-label">Upload Resume</label>
            <input type="file" class="form-control" id="resume" name="resume" required>
        </div>
        <div class="mb-3">
            <label for="coverLetter" class="form-label">Cover Letter</label>
            <textarea class="form-control" id="coverLetter" name="coverLetter" rows="5" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit Application</button>
    </form>
</div>
</body>
</html>
