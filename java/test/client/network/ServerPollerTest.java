/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.network;

import client.model.Populator;
import client.model.Serializer;
import client.model.iPopulator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import shared.models.DTO.ClientModelDTO;

/**
 *
 * @author Peter Anderson <anderson.peter@byu.edu>
 */
public class ServerPollerTest {

    public ServerPollerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void pollTest() {
        Serializer serializer = new Serializer();
        String defaultModel = "{\n"
                + "  \"deck\": {\n"
                + "    \"yearOfPlenty\": 2,\n"
                + "    \"monopoly\": 2,\n"
                + "    \"soldier\": 14,\n"
                + "    \"roadBuilding\": 2,\n"
                + "    \"monument\": 5\n"
                + "  },\n"
                + "  \"map\": {\n"
                + "    \"hexes\": [\n"
                + "      {\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": -2\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"brick\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -2\n"
                + "        },\n"
                + "        \"number\": 4\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wood\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 2,\n"
                + "          \"y\": -2\n"
                + "        },\n"
                + "        \"number\": 11\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"brick\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -1,\n"
                + "          \"y\": -1\n"
                + "        },\n"
                + "        \"number\": 8\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wood\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": -1\n"
                + "        },\n"
                + "        \"number\": 3\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"ore\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -1\n"
                + "        },\n"
                + "        \"number\": 9\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"sheep\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 2,\n"
                + "          \"y\": -1\n"
                + "        },\n"
                + "        \"number\": 12\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"ore\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 0\n"
                + "        },\n"
                + "        \"number\": 5\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"sheep\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -1,\n"
                + "          \"y\": 0\n"
                + "        },\n"
                + "        \"number\": 10\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wheat\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 0\n"
                + "        },\n"
                + "        \"number\": 11\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"brick\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 1,\n"
                + "          \"y\": 0\n"
                + "        },\n"
                + "        \"number\": 5\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wheat\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 2,\n"
                + "          \"y\": 0\n"
                + "        },\n"
                + "        \"number\": 6\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wheat\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 1\n"
                + "        },\n"
                + "        \"number\": 2\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"sheep\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -1,\n"
                + "          \"y\": 1\n"
                + "        },\n"
                + "        \"number\": 9\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wood\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 1\n"
                + "        },\n"
                + "        \"number\": 4\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"sheep\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 1,\n"
                + "          \"y\": 1\n"
                + "        },\n"
                + "        \"number\": 10\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wood\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 2\n"
                + "        },\n"
                + "        \"number\": 6\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"ore\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -1,\n"
                + "          \"y\": 2\n"
                + "        },\n"
                + "        \"number\": 3\n"
                + "      },\n"
                + "      {\n"
                + "        \"resource\": \"wheat\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 2\n"
                + "        },\n"
                + "        \"number\": 8\n"
                + "      }\n"
                + "    ],\n"
                + "    \"roads\": [\n"
                + "      {\n"
                + "        \"owner\": 1,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"S\",\n"
                + "          \"x\": -1,\n"
                + "          \"y\": -1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 3,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": -1,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 3,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": 2,\n"
                + "          \"y\": -2\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 2,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"S\",\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 0,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"S\",\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 2,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"S\",\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 0\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 1,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 0,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": 2,\n"
                + "          \"y\": 0\n"
                + "        }\n"
                + "      }\n"
                + "    ],\n"
                + "    \"cities\": [],\n"
                + "    \"settlements\": [\n"
                + "      {\n"
                + "        \"owner\": 3,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": -1,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 3,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SE\",\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -2\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 2,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 0\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 2,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 1,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 0,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SE\",\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 1,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": -1,\n"
                + "          \"y\": -1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"owner\": 0,\n"
                + "        \"location\": {\n"
                + "          \"direction\": \"SW\",\n"
                + "          \"x\": 2,\n"
                + "          \"y\": 0\n"
                + "        }\n"
                + "      }\n"
                + "    ],\n"
                + "    \"radius\": 3,\n"
                + "    \"ports\": [\n"
                + "      {\n"
                + "        \"ratio\": 3,\n"
                + "        \"direction\": \"N\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 0,\n"
                + "          \"y\": 3\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 3,\n"
                + "        \"direction\": \"SW\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 3,\n"
                + "          \"y\": -3\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 2,\n"
                + "        \"resource\": \"ore\",\n"
                + "        \"direction\": \"S\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 1,\n"
                + "          \"y\": -3\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 2,\n"
                + "        \"resource\": \"brick\",\n"
                + "        \"direction\": \"NE\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -2,\n"
                + "          \"y\": 3\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 3,\n"
                + "        \"direction\": \"NW\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 2,\n"
                + "          \"y\": 1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 2,\n"
                + "        \"resource\": \"wood\",\n"
                + "        \"direction\": \"NE\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -3,\n"
                + "          \"y\": 2\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 3,\n"
                + "        \"direction\": \"SE\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -3,\n"
                + "          \"y\": 0\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 2,\n"
                + "        \"resource\": \"sheep\",\n"
                + "        \"direction\": \"NW\",\n"
                + "        \"location\": {\n"
                + "          \"x\": 3,\n"
                + "          \"y\": -1\n"
                + "        }\n"
                + "      },\n"
                + "      {\n"
                + "        \"ratio\": 2,\n"
                + "        \"resource\": \"wheat\",\n"
                + "        \"direction\": \"S\",\n"
                + "        \"location\": {\n"
                + "          \"x\": -1,\n"
                + "          \"y\": -2\n"
                + "        }\n"
                + "      }\n"
                + "    ],\n"
                + "    \"robber\": {\n"
                + "      \"x\": 0,\n"
                + "      \"y\": -2\n"
                + "    }\n"
                + "  },\n"
                + "  \"players\": [\n"
                + "    {\n"
                + "      \"resources\": {\n"
                + "        \"brick\": 0,\n"
                + "        \"wood\": 1,\n"
                + "        \"sheep\": 1,\n"
                + "        \"wheat\": 1,\n"
                + "        \"ore\": 0\n"
                + "      },\n"
                + "      \"oldDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"newDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"roads\": 13,\n"
                + "      \"cities\": 4,\n"
                + "      \"settlements\": 3,\n"
                + "      \"soldiers\": 0,\n"
                + "      \"victoryPoints\": 2,\n"
                + "      \"monuments\": 0,\n"
                + "      \"playedDevCard\": false,\n"
                + "      \"discarded\": false,\n"
                + "      \"playerID\": 0,\n"
                + "      \"playerIndex\": 0,\n"
                + "      \"name\": \"Sam\",\n"
                + "      \"color\": \"orange\"\n"
                + "    },\n"
                + "    {\n"
                + "      \"resources\": {\n"
                + "        \"brick\": 1,\n"
                + "        \"wood\": 0,\n"
                + "        \"sheep\": 1,\n"
                + "        \"wheat\": 0,\n"
                + "        \"ore\": 1\n"
                + "      },\n"
                + "      \"oldDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"newDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"roads\": 13,\n"
                + "      \"cities\": 4,\n"
                + "      \"settlements\": 3,\n"
                + "      \"soldiers\": 0,\n"
                + "      \"victoryPoints\": 2,\n"
                + "      \"monuments\": 0,\n"
                + "      \"playedDevCard\": false,\n"
                + "      \"discarded\": false,\n"
                + "      \"playerID\": 1,\n"
                + "      \"playerIndex\": 1,\n"
                + "      \"name\": \"Brooke\",\n"
                + "      \"color\": \"blue\"\n"
                + "    },\n"
                + "    {\n"
                + "      \"resources\": {\n"
                + "        \"brick\": 0,\n"
                + "        \"wood\": 1,\n"
                + "        \"sheep\": 1,\n"
                + "        \"wheat\": 1,\n"
                + "        \"ore\": 0\n"
                + "      },\n"
                + "      \"oldDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"newDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"roads\": 13,\n"
                + "      \"cities\": 4,\n"
                + "      \"settlements\": 3,\n"
                + "      \"soldiers\": 0,\n"
                + "      \"victoryPoints\": 2,\n"
                + "      \"monuments\": 0,\n"
                + "      \"playedDevCard\": false,\n"
                + "      \"discarded\": false,\n"
                + "      \"playerID\": 10,\n"
                + "      \"playerIndex\": 2,\n"
                + "      \"name\": \"Pete\",\n"
                + "      \"color\": \"red\"\n"
                + "    },\n"
                + "    {\n"
                + "      \"resources\": {\n"
                + "        \"brick\": 0,\n"
                + "        \"wood\": 1,\n"
                + "        \"sheep\": 1,\n"
                + "        \"wheat\": 0,\n"
                + "        \"ore\": 1\n"
                + "      },\n"
                + "      \"oldDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"newDevCards\": {\n"
                + "        \"yearOfPlenty\": 0,\n"
                + "        \"monopoly\": 0,\n"
                + "        \"soldier\": 0,\n"
                + "        \"roadBuilding\": 0,\n"
                + "        \"monument\": 0\n"
                + "      },\n"
                + "      \"roads\": 13,\n"
                + "      \"cities\": 4,\n"
                + "      \"settlements\": 3,\n"
                + "      \"soldiers\": 0,\n"
                + "      \"victoryPoints\": 2,\n"
                + "      \"monuments\": 0,\n"
                + "      \"playedDevCard\": false,\n"
                + "      \"discarded\": false,\n"
                + "      \"playerID\": 11,\n"
                + "      \"playerIndex\": 3,\n"
                + "      \"name\": \"Mark\",\n"
                + "      \"color\": \"green\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"log\": {\n"
                + "    \"lines\": [\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Mark\",\n"
                + "        \"message\": \"Mark's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Pete\",\n"
                + "        \"message\": \"Pete's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Brooke\",\n"
                + "        \"message\": \"Brooke's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam built a road\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam built a settlement\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam's turn just ended\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"source\": \"Sam\",\n"
                + "        \"message\": \"Sam rolled a 7.\"\n"
                + "      }\n"
                + "    ]\n"
                + "  },\n"
                + "  \"chat\": {\n"
                + "    \"lines\": []\n"
                + "  },\n"
                + "  \"bank\": {\n"
                + "    \"brick\": 23,\n"
                + "    \"wood\": 21,\n"
                + "    \"sheep\": 20,\n"
                + "    \"wheat\": 22,\n"
                + "    \"ore\": 22\n"
                + "  },\n"
                + "  \"turnTracker\": {\n"
                + "    \"status\": \"Robbing\",\n"
                + "    \"currentTurn\": 0,\n"
                + "    \"longestRoad\": -1,\n"
                + "    \"largestArmy\": -1\n"
                + "  },\n"
                + "  \"winner\": -1,\n"
                + "  \"version\": 1\n"
                + "}";
        MockServerProxy proxy = new MockServerProxy(serializer, defaultModel);
        iPopulator populator = new Populator();
        ServerPoller poller = new ServerPoller(proxy, populator, 0);
        ClientModelDTO model = poller.poll();
        ClientModelDTO testModel = null;
        assert (model == testModel);
    }
}
