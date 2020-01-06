package controller;

public class ProfileController {

    private ProfileService service;

    @Autowired
    public ProfileController(ProfileService service) {

        this.service = service;
    }

    @PostMapping
    public ResponseEntity createProfile(
            @RequestBody ProfileDocument document) throws Exception {

        return
                new ResponseEntity(service.createProfileDocument(document), HttpStatus.CREATED);
    }
}
