function showCourses(){
    fetch("http://localhost:8080/courses") 
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable");

        courses.forEach(course => {
            var row = `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.courseDescription}</td>
                <td>${course.trainerName}</td>
                <td>${course.courseDuration}</td>
                <td>${course.courseCategory}</td>
            </tr>`;

            dataTable.innerHTML += row;
        });
    });   
}

function showStudents(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((response) => response.json())
    .then((students) => {

        const dataTable = document.getElementById("studentsTable");

        students.forEach(student => {

            var row = `<tr>
                <td>${student.registrationId}</td> 
                <td>${student.studentName}</td>
                <td>${student.studentEmail}</td>
                <td>${student.courseName}</td>
                 <td>${student.status}</td>
            </tr>`;

            dataTable.innerHTML += row;

        });

    });   
}