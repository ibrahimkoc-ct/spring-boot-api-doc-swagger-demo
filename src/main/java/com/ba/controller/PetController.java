package com.ba.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.model.Pet;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/pet")
@Api(value = "My Pet API Documentation")
public class PetController {
	
	private List<Pet> petList= new ArrayList<Pet>();
	
	@PostConstruct
	public void init(){
	petList.add(new Pet(1,"mick",new Date()));
	}

	@PostMapping
	@ApiOperation(value = "new Pet add mehtod",notes = "Warning")
	public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "animals") Pet pet){
		petList.add(pet);
		return ResponseEntity.ok(pet);
		
	}
	
	@GetMapping
	@ApiOperation(value = "Pet List mehtod",notes = "Pet List")
	public ResponseEntity<List<Pet>> getallPet(){
		return ResponseEntity.ok(petList);
	}

}
