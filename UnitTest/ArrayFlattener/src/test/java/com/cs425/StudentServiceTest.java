package com.cs425;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class StudentServiceTest {

    private RemoteService remoteServiceMock;
    private StudentService studentService;

    @Before
    public void setUp() {

        remoteServiceMock = Mockito.mock(RemoteService.class);
        studentService = new StudentService(remoteServiceMock);
    }

    @Test
    public void testGetStudentById_Success() {

        Student fakeStudent = new Student(1, "Sujit Kuamr Chanda");
        when(remoteServiceMock.fetchStudent(1)).thenReturn(fakeStudent);
        Student result = studentService.getStudentById(1);
        assertNotNull(result);
        assertEquals("Sujit Kumar Chanda", result.getName());
        verify(remoteServiceMock, times(1)).fetchStudent(1);
    }

    @Test(expected = RuntimeException.class)
    public void testGetStudentById_Failure() {
        when(remoteServiceMock.fetchStudent(1)).thenThrow(new RuntimeException("Remote service down"));
        studentService.getStudentById(1);
    }
}