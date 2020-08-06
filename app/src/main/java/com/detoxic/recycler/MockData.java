package com.detoxic.recycler;

import com.detoxic.recycler.models.Baby;
import com.detoxic.recycler.models.Group;
import com.detoxic.recycler.models.MockResponse;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    static MockResponse getData() {
        MockResponse response = new MockResponse();
        List<Group> groupList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Group group = new Group();
            group.setTitle("Group Title " + i);
            List<Baby> babyList = new ArrayList<>();
            for (int j = 1; j < 5; j++) {
                Baby baby = new Baby();
                baby.setTitle("Child Title " + j);
                babyList.add(baby);
            }
            group.setBabies(babyList);
            groupList.add(group);
        }
        response.setGroups(groupList);
        return response;
    }

}
