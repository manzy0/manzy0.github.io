<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Portfolio</title>
    <style>
        /* --- Base Styles --- */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
            color: #333;
        }
        header {
            background: #2c3e50;
            color: #fff;
            padding: 3rem 1rem;
            text-align: center;
        }
        header h1 {
            margin: 0;
            font-size: 2.5rem;
        }
        .container {
            max-width: 1100px;
            margin: auto;
            padding: 2rem;
        }
        h2 {
            border-bottom: 2px solid #3498db;
            padding-bottom: 0.5rem;
            margin-top: 2rem;
        }

        /* --- Grid Layout --- */
        .project-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 1.5rem;
            margin-top: 1.5rem;
        }

        /* --- Project Cards --- */
        .card {
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            padding: 1.5rem;
            transition: transform 0.2s ease-in-out;
        }
        .card:hover {
            transform: translateY(-5px);
        }
        .card h3 {
            margin-top: 0;
            color: #2c3e50;
        }
        .card .tags {
            font-size: 0.85rem;
            color: #7f8c8d;
            margin-bottom: 1rem;
        }
        .btn {
            display: inline-block;
            background: #3498db;
            color: #fff;
            padding: 0.5rem 1rem;
            text-decoration: none;
            border-radius: 4px;
            margin-top: 1rem;
        }
        .btn:hover {
            background: #2980b9;
        }

        /* --- Footer --- */
        footer {
            text-align: center;
            padding: 2rem;
            background: #2c3e50;
            color: #fff;
            margin-top: 3rem;
        }
    </style>
</head>
<body>

    <header>
        <h1>[Your Name]</h1>
        <p>Software Developer & Maker</p>
    </header>

    <div class="container">
        <section id="about">
            <h2>About Me</h2>
            <p>Welcome to my portfolio! I build digital solutions and physical prototypes. Here is a collection of my latest work across software engineering and hardware design.</p>
        </section>

        <section id="software">
            <h2>Software Projects</h2>
            <div class="project-grid">
                <div class="card">
                    <h3>Project Title 1</h3>
                    <p class="tags">Python, Flask, API</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
                <div class="card">
                    <h3>Project Title 2</h3>
                    <p class="tags">JavaScript, React, CSS</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
                <div class="card">
                    <h3>Project Title 3</h3>
                    <p class="tags">Java, Spring Boot</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
                <div class="card">
                    <h3>Project Title 4</h3>
                    <p class="tags">C++, Unreal Engine</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
                <div class="card">
                    <h3>Project Title 5</h3>
                    <p class="tags">HTML, CSS, JS</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
                <div class="card">
                    <h3>Project Title 6</h3>
                    <p class="tags">SQL, Data Analysis</p>
                    <p>A brief description of what this coded project does, the problem it solves, and your specific role in building it.</p>
                    <a href="#" class="btn">View on GitHub</a>
                </div>
            </div>
        </section>

        <section id="hardware">
            <h2>Physical & Hardware Projects</h2>
            <div class="project-grid">
                <div class="card">
                    <h3>Physical Artifact 1</h3>
                    <p class="tags">Arduino, 3D Printing, C++</p>
                    <p>Description of the physical build. Mention the materials used, the design process, and how you brought the artifact to life.</p>
                    <a href="#" class="btn">View Gallery/Details</a>
                </div>
                <div class="card">
                    <h3>Physical Artifact 2</h3>
                    <p class="tags">Raspberry Pi, Woodworking</p>
                    <p>Description of the physical build. Mention the materials used, the design process, and how you brought the artifact to life.</p>
                    <a href="#" class="btn">View Gallery/Details</a>
                </div>
            </div>
        </section>
    </div>

    <footer>
        <p>Connect with me: <a href="mailto:your.email@example.com" style="color: #3498db;">Email</a> | <a href="https://github.com/yourusername" style="color: #3498db;">GitHub</a> | <a href="https://linkedin.com/in/yourusername" style="color: #3498db;">LinkedIn</a></p>
    </footer>

</body>
</html>
