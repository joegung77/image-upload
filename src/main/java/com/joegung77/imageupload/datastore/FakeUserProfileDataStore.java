package com.joegung77.imageupload.datastore;

import com.joegung77.imageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("2fbb8252-3a33-4fb9-81e1-fefa1e5567b6"), "joegung", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("cea6b4e8-c473-4480-9e5a-9008cccdcd90"), "danielschmidt", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
