package com.cs425;

public class StudentService {
    private final RemoteService remoteService;

    public StudentService(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    public Student getStudentById(int studentId) {
        return remoteService.fetchStudent(studentId);
    }
}
