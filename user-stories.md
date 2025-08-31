# User Stories for Smart Clinic Application

## Admin User Stories

### 1. User Story: Admin Login
- **Description**: As an Admin, I want to securely log in to the portal so that I can manage the system.  
- **Acceptance Criteria**:
  - Admin should enter valid username and password.  
  - System must validate credentials against the database.  
  - Successful login redirects to Admin dashboard.  
- **Priority**: High  
- **Story Points**: 3  

### 2. User Story: Add Doctor
- **Description**: As an Admin, I want to add new doctors with their details so that patients can book appointments.  
- **Acceptance Criteria**:
  - Admin can enter doctor name, specialization, contact info, and schedule.  
  - Doctor entry should be stored in the database.  
  - A confirmation message should appear after saving.  
- **Priority**: High  
- **Story Points**: 5  

### 3. User Story: Manage Patients
- **Description**: As an Admin, I want to view and update patient records so that records stay accurate.  
- **Acceptance Criteria**:
  - Admin can view patient details.  
  - Admin can update contact details.  
  - Changes must be reflected immediately in the database.  
- **Priority**: Medium  
- **Story Points**: 4  

### 4. User Story: View Reports
- **Description**: As an Admin, I want to generate daily and monthly reports so that I can track clinic activity.  
- **Acceptance Criteria**:
  - Admin can generate appointment statistics.  
  - Reports must be downloadable in PDF/CSV format.  
- **Priority**: Medium  
- **Story Points**: 6  

### 5. User Story: Remove Doctor
- **Description**: As an Admin, I want to remove inactive doctors so that only active doctors appear in the system.  
- **Acceptance Criteria**:
  - Admin can select and remove a doctor.  
  - Doctor should not appear in patient search results after removal.  
- **Priority**: Low  
- **Story Points**: 3  


---

## Doctor User Stories

### 1. User Story: Doctor Login
- **Description**: As a Doctor, I want to log in securely so that I can view and manage appointments.  
- **Acceptance Criteria**:
  - Doctor enters valid username and password.  
  - Successful login redirects to Doctor dashboard.  
- **Priority**: High  
- **Story Points**: 3  

### 2. User Story: View Appointments
- **Description**: As a Doctor, I want to view my scheduled appointments so that I can prepare for patients.  
- **Acceptance Criteria**:
  - Doctor sees a list of upcoming appointments.  
  - Each entry shows patient name, time, and purpose.  
- **Priority**: High  
- **Story Points**: 5  

### 3. User Story: Update Availability
- **Description**: As a Doctor, I want to update my availability so that patients can book only at correct times.  
- **Acceptance Criteria**:
  - Doctor can set available slots.  
  - Patients cannot book outside updated slots.  
- **Priority**: Medium  
- **Story Points**: 4  

### 4. User Story: Add Notes
- **Description**: As a Doctor, I want to add notes after appointments so that patient history is tracked.  
- **Acceptance Criteria**:
  - Doctor can write notes and prescriptions.  
  - Notes must be stored in the patient’s record.  
- **Priority**: Medium  
- **Story Points**: 6  

### 5. User Story: Cancel Appointment
- **Description**: As a Doctor, I want to cancel appointments if I am unavailable so that patients are notified.  
- **Acceptance Criteria**:
  - Doctor can cancel with a reason.  
  - Patient must receive a notification.  
- **Priority**: Low  
- **Story Points**: 3  


---

## Patient User Stories

### 1. User Story: Patient Login
- **Description**: As a Patient, I want to log in to the portal so that I can manage my appointments.  
- **Acceptance Criteria**:
  - Patient enters valid credentials.  
  - Login redirects to Patient dashboard.  
- **Priority**: High  
- **Story Points**: 3  

### 2. User Story: Search Doctor
- **Description**: As a Patient, I want to search doctors by specialization so that I can find the right doctor.  
- **Acceptance Criteria**:
  - Patient can search by name or specialization.  
  - Results display doctor details and availability.  
- **Priority**: High  
- **Story Points**: 5  

### 3. User Story: Book Appointment
- **Description**: As a Patient, I want to book an appointment with a doctor so that I can get medical consultation.  
- **Acceptance Criteria**:
  - Patient selects a doctor and available slot.  
  - Appointment must be saved in the system.  
  - A confirmation message should be displayed.  
- **Priority**: High  
- **Story Points**: 6  

### 4. User Story: Cancel Appointment
- **Description**: As a Patient, I want to cancel my appointment so that the slot becomes available for others.  
- **Acceptance Criteria**:
  - Patient can cancel with a reason.  
  - Doctor is notified of cancellation.  
- **Priority**: Medium  
- **Story Points**: 3  

### 5. User Story: View Medical History
- **Description**: As a Patient, I want to view my past appointments and prescriptions so that I can keep track of my health records.  
- **Acceptance Criteria**:
  - Patients can see past appointments.  
  - Patients can download prescriptions.  
- **Priority**: Medium  
- **Story Points**: 4  
