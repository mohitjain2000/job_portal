	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Contact Us</title>
	    <link rel="stylesheet" href="style4.css">
	</head>
	<body>
	    <div class="container">
	        <h1>Contact Us</h1>
	        <p>Have a question or feedback? Fill out the form below and we'll get back to you.</p>
	        <form action="/" method="get">
	            <div class="form-group">
	                <label for="name">Your Name:</label>
	                <input type="text" id="name" name="name" required>
	            </div>
	            <div class="form-group">
	                <label for="email">Your Email:</label>
	                <input type="email" id="email" name="email" required>
	            </div>
	            <div class="form-group">
	                <label for="message">Message:</label>
	                <textarea id="message" name="message" rows="4" required></textarea>
	            </div>
	            <button type="submit" class="btn btn-primary">Send Message</button>
	        </form>
	    </div>
	</body>
	</html>
