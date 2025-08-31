# Smart Clinic MySQL Schema Design

## Tables

### Doctor
- doctor_id INT PRIMARY KEY AUTO_INCREMENT
- name VARCHAR(100)
- specialization VARCHAR(50)
- available_times JSON

### Patient
- patient_id INT PRIMARY KEY AUTO_INCREMENT
- name VARCHAR(100)
- email VARCHAR(100) UNIQUE
- phone VARCHAR(15)

### Appointment
- appointment_id INT PRIMARY KEY AUTO_INCREMENT
- doctor_id INT FOREIGN KEY REFERENCES Doctor(doctor_id)
- patient_id INT FOREIGN KEY REFERENCES Patient(patient_id)
- appointment_time DATETIME

### Prescription
- prescription_id INT PRIMARY KEY AUTO_INCREMENT
- appointment_id INT FOREIGN KEY REFERENCES Appointment(appointment_id)
- details TEXT
