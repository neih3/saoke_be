//package com.saoke.mttq.exception;
//
//import com.saoke.mttq.message.ResponseMessage;
//import org.springframework.web.multipart.MaxUploadSizeExceededException;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class FileUploadExceptionAdvice extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public ResponseEntity handleMaxSizeException(MaxUploadSizeExceededException exc) {
//        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("File too large!"));
//    }
//}
