<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="ab" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page import="com.mohit.SpringJdbc.model.JobPost" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Job Post</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#"> Job Portal Web App</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
             <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/viewalljobs">All Jobs</a></li>
                <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="mb-4 text-center font-weight-bold">Edit Job Post</h2>
    <form action="/updateJob" method="post"> <!-- Update the form action as per your controller mapping -->
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="mb-3">
                    <label for="postId" class="form-label">Post ID</label>
                    <input type="text" class="form-control" id="postId" name="postId" value="${item.postId}">
                </div>
                <div class="mb-3">
                    <label for="postProfile" class="form-label">Profile</label>
                    <input type="text" class="form-control" id="postProfile" name="postProfile" value="${item.postProfile}">
                </div>
                <div class="mb-3">
                    <label for="postDesc" class="form-label">Description</label>
                    <input type="text" class="form-control" id="postDesc" name="postDesc" value="${item.postDesc}">
                </div>
                <div class="mb-3">
                    <label for="reqExperience" class="form-label">Required Experience (in years)</label>
                    <input type="number" class="form-control" id="reqExperience" name="reqExperience" value="${item.reqExperience}">
                </div>
                <div class="mb-2">
									<label for="postTechStack" class="form-label">Tech Stack</label>
									<select multiple class="form-select" id="postTechStack"
										name="postTechStack" required>
										<!-- Add options dynamically from your backend or provide static options -->
										<option value="Java">Java</option>
										<option value="JavaScript">JavaScript</option>
										<!-- Additional options -->
										<option value="Swift">Swift</option>
										<option value="TypeScript">TypeScript</option>
										<option value="Go">Go</option>
										<option value="Kotlin">Kotlin</option>
										<option value="Rust">Rust</option>
										<option value="PHP">PHP</option>
										<option value="HTML5">HTML5</option>
										<option value="CSS3">CSS3</option>
										<option value="GraphQL">GraphQL</option>
										<option value="Raspberry Pi">Raspberry Pi</option>
										<option value="Arduino">Arduino</option>
										<option value="IoT (Internet of Things)">IoT (Internet
											of Things)</option>
										<option value="Apache Kafka">Apache Kafka</option>
										<option value="Elasticsearch">Elasticsearch</option>
										<option value="Unity">Unity</option>
										<option value="Game Development">Game Development</option>
										<option value="Vue.js">Vue.js</option>
										<option value="Angular">Angular</option>
										<option value="React Native">React Native</option>
										<option value="Flutter">Flutter</option>
										<option value="Node.js">Node.js</option>
										<option value="Express.js">Express.js</option>
										<option value="Django">Django</option>
										<option value="Flask">Flask</option>
										<option value="Ruby on Rails">Ruby on Rails</option>
										<option value="Laravel">Laravel</option>
										<option value="TensorFlow">TensorFlow</option>
										<option value="PyTorch">PyTorch</option>
										<option value="Kubernetes">Kubernetes</option>
										<option value="Docker">Docker</option>
										<option value="Jenkins">Jenkins</option>
										<option value="AWS (Amazon Web Services)">AWS (Amazon
											Web Services)</option>
										<option value="Azure">Azure</option>
										<option value="Google Cloud">Google Cloud</option>
										<option value="DevOps">DevOps</option>
										<option value="Blockchain">Blockchain</option>
										<option value="Machine Learning">Machine Learning</option>
										<option value="Artificial Intelligence">Artificial
											Intelligence</option>
										<option value="Cybersecurity">Cybersecurity</option>
										<option
											value="CISSP (Certified Information Systems Security Professional)">CISSP
											(Certified Information Systems Security Professional)</option>
										<option value="CompTIA Security+">CompTIA Security+</option>
										<option value="Certified Ethical Hacker (CEH)">Certified
											Ethical Hacker (CEH)</option>
										<option value="Scrum">Scrum</option>
										<option value="Agile">Agile</option>
										<option value="Kanban">Kanban</option>
										<option value="GraphQL">GraphQL</option>
										<option value="Vue.js">Vue.js</option>
										<option value="Angular">Angular</option>
										<option value="React Native">React Native</option>
										<option value="Flutter">Flutter</option>
										<option value="Node.js">Node.js</option>
										<option value="Express.js">Express.js</option>
										<option value="Django">Django</option>
										<option value="Flask">Flask</option>
										<option value="Ruby on Rails">Ruby on Rails</option>
										<option value="Laravel">Laravel</option>
										<option value="TensorFlow">TensorFlow</option>
										<option value="PyTorch">PyTorch</option>
										<option value="Kubernetes">Kubernetes</option>
										<option value="Docker">Docker</option>
										<option value="Jenkins">Jenkins</option>
										<option value="AWS (Amazon Web Services)">AWS (Amazon
											Web Services)</option>
										<option value="Azure">Azure</option>
										<option value="Google Cloud">Google Cloud</option>
										<option value="DevOps">DevOps</option>
										<option value="Blockchain">Blockchain</option>
										<option value="Machine Learning">Machine Learning</option>
										<option value="Artificial Intelligence">Artificial
											Intelligence</option>
										<option value="Cybersecurity">Cybersecurity</option>
										<option
											value="CISSP (Certified Information Systems Security Professional)">CISSP
											(Certified Information Systems Security Professional)</option>
										<option value="CompTIA Security+">CompTIA Security+</option>
										<option value="Certified Ethical Hacker (CEH)">Certified
											Ethical Hacker (CEH)</option>
										<option value="Scrum">Scrum</option>
										<option value="Agile">Agile</option>
										<option value="Kanban">Kanban</option>
										<option value="GraphQL">GraphQL</option>
										<option value="Raspberry Pi">Raspberry Pi</option>
										<option value="Arduino">Arduino</option>
										<option value="IoT (Internet of Things)">IoT (Internet
											of Things)</option>
										<option value="Apache Kafka">Apache Kafka</option>
										<option value="Elasticsearch">Elasticsearch</option>
										<option value="Unity">Unity</option>
										<option value="Game Development">Game Development</option>
										<option value="Swift">Swift</option>
										<option value="TypeScript">TypeScript</option>
										<option value="Go">Go</option>
										<option value="Kotlin">Kotlin</option>
										<option value="Rust">Rust</option>
										<option value="PHP">PHP</option>
										<option value="HTML5">HTML5</option>
										<option value="CSS3">CSS3</option>
										<option value="GraphQL">GraphQL</option>
										<option value="Raspberry Pi">Raspberry Pi</option>
										<option value="Arduino">Arduino</option>
										<option value="IoT (Internet of Things)">IoT (Internet
											of Things)</option>
										<option value="Apache Kafka">Apache Kafka</option>
										<option value="Elasticsearch">Elasticsearch</option>
										<option value="Unity">Unity</option>
										<option value="Game Development">Game Development</option>
	
	
									</select>
								</div>
                
                <div class="mb-3">
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </div>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
