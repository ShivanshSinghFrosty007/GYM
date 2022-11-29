package com.example.gym;

public class Data {

    private String[] name = {"Shoulder Press", "Seated Dumbbell Shoulder Press", "Elevated Pike Press"};
    private int[] image = {R.drawable.sholderpress, R.drawable.seated_dumbbell_shoulder_press, R.drawable.elevated_pike_press};
    private String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/shoulder%2FshoulderPress.mp4?alt" +
            "=media&token=6d8b56af-7050-4c93-bc54-16f3fb367c2b", "https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/" +
            "o/shoulder%2FShoulder%20Dumbbell%20Press%20Front.mp4?alt=media&token=f5f341e7-df6c-42c7-b3de-947fe38cd5e8", "https://firebasesto" +
            "rage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/shoulder%2FElevated%20Pike%20Press.mp4?alt=media&token=a4091c45-bf50-4c5" +
            "d-bbb3-b43f05efaf6b"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Chest {

    public String[] name = {"Barbell Bench Press", "Dips", "Dumbbell Flys"};
    public int[] image = {R.drawable.barbell_bench_press, R.drawable.dips, R.drawable.dumbbell_flys};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Chest%2FBarbell%20Bench%20Press" +
            ".mp4?alt=media&token=01bed87c-4d35-428a-85da-8b02a51ae412", "https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.app" +
            "spot.com/o/Chest%2FDips.mp4?alt=media&token=e40ab330-037f-40f5-9bdc-44a9fe6be923", "https://firebasestorage.googleapis.com/v" +
            "0/b/gymnasium-50868.appspot.com/o/Chest%2FDumbbell%20Flys.mp4?alt=media&token=e11a3092-b6ac-4da0-b3e0-c65c1d4c5845"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Biceps {

    public String[] name = {"Barbell Curl", "Dumbbell Hammer Curl", "Goblet Curl"};
    public int[] image = {R.drawable.barbell_curl, R.drawable.dumbbell_hammer_curl, R.drawable.goblet_curl};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Biceps%2FBarbell%20Curl." +
            "mp4?alt=media&token=e486e281-82c5-4820-8f85-eca9666c6bd5", "https://firebasestorage.googleapis.com/v0/b/gymnasium-508" +
            "68.appspot.com/o/Biceps%2FDumbbell%20Hammer%20Curl.mp4?alt=media&token=c5bb97f4-15e7-42e9-8bff-42a00b6c8786", "http" +
            "s://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Biceps%2Fkettlebell%20male%20goblet%20curl%20s" +
            "ide.mp4?alt=media&token=dc042e96-61da-4b8f-a0b3-116e8e62a520"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Triceps {
    public String[] name = {"Dips", "Laying Triceps Extensions", "Cable Pushdown"};
    public int[] image = {R.drawable.dips, R.drawable.laying_triceps_extensions, R.drawable.cable_pushdown};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Chest%2FDips.mp4?alt=media&t" +
            "oken=e40ab330-037f-40f5-9bdc-44a9fe6be923", "https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/T" +
            "riceps%2FLaying%20Triceps%20Extensions.mp4?alt=media&token=4ea4241e-f91e-4dd7-8f0e-315015d02859", "https://firebasestor" +
            "age.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Triceps%2FCable%20Pushdown.mp4?alt=media&token=47f45962-db9f-4557-" +
            "bd9f-b76d04e770e5"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Forearms {
    public String[] name = {"Dumbbells Wrist Curl", "Barbell Wrist Curl", "Behind Barbell Wrist Curl"};
    public int[] image = {R.drawable.dumbbells_wrist_curl, R.drawable.barbell_wrist_curl, R.drawable.behind_the_back_barbell_wrist_curl};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Forearms%2FDumbbells%20Wr" +
            "ist%20Curl.mp4?alt=media&token=07e6a3d3-09ec-4f2f-a1f0-4fa6a9b38cbd", "https://firebasestorage.googleapis.com/v0/b/gy" +
            "mnasium-50868.appspot.com/o/Forearms%2FBarbell%20Wrist%20Curl.mp4?alt=media&token=46c4ab1e-3c1d-48a8-95f2-ea0c7b6c7" +
            "a11", "https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Forearms%2FBehind%20The%20Back%20Ba" +
            "rbell%20Wrist%20Curl.mp4?alt=media&token=810acd9b-544d-4151-9202-0214b4dc1891"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Abdominals {
    public String[] name = {"Crunches", "Laying Leg Raises", "Hanging Knee Raises"};
    public int[] image = {R.drawable.crunches, R.drawable.laying_leg_raises, R.drawable.hanging_knee_raises};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Abdominals%2FCrunches.mp4" +
            "?alt=media&token=7b37fae1-a28a-4a2a-8ae8-2d26866c49f1", "https://firebasestorage.googleapis.com/v0/b/gymnasium-50868." +
            "appspot.com/o/Abdominals%2FHanging%20Knee%20Raises.mp4?alt=media&token=1c57de8a-d4c4-411e-8eb4-6d0f2bcebc14", "https:" +
            "//firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Abdominals%2FHanging%20Knee%20Raises.mp4?alt=med" +
            "ia&token=1c57de8a-d4c4-411e-8eb4-6d0f2bcebc14"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Obliques {
    public String[] name = {"Russian Twist", "Windmill", "Kettlebell Woodchopper"};
    public int[] image = {R.drawable.russian_twist, R.drawable.windmill, R.drawable.kettlebell_woodchopper};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Obliques%2FRussian%20Twis" +
            "t.mp4?alt=media&token=4148a77c-f3e7-407e-a99c-3925577992f5", "https://firebasestorage.googleapis.com/v0/b/gymnasium-" +
            "50868.appspot.com/o/Obliques%2Fwindmill.mp4?alt=media&token=514c48e5-a6f3-4788-a338-906db392391e", "https://firebase" +
            "storage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Obliques%2Fkettlebell%20male%20woodchopper.mp4?alt=media&" +
            "token=e74b2ab6-3a98-4d19-a634-62a2d579c805"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Quads {
    public String[] name = {"Barbell Squat", "Leg Press", "Forward Lunge"};
    public int[] image = {R.drawable.barbell_squat, R.drawable.leg_pres, R.drawable.forward_lunge};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Quads%2FBarbell%20Squat" +
            ".mp4?alt=media&token=3761cb2a-85e1-4b61-9dba-e43e1d2713a5", "https://firebasestorage.googleapis.com/v0/b/gymnasium" +
            "-50868.appspot.com/o/Quads%2FLeg%20Press.mp4?alt=media&token=0653a816-7609-45a1-97d3-b0017a0208df", "https://fireb" +
            "asestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Quads%2FForward%20Lunge.mp4?alt=media&token=1bd83591" +
            "-2a56-47f5-8f92-ef663164094a"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

class Calves {
    public String[] name = {"DB Calve Raise", "Band Calf Raise", "Seated Calf Raises"};
    public int[] image = {R.drawable.db_calve_raise, R.drawable.db_calve_raise, R.drawable.seated_calf_raises};
    public String[] url = {"https://firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Calves%2FDB%20Calve%20Rai" +
            "se.mp4?alt=media&token=b3ddab39-76e0-4b7a-84c1-def950d12241", "https://firebasestorage.googleapis.com/v0/b/gymnasium" +
            "-50868.appspot.com/o/Calves%2FBand%20Calf%20Raise.mp4?alt=media&token=56fd239a-98f7-4bdb-a5b4-bf9f8be85a21", "https:" +
            "//firebasestorage.googleapis.com/v0/b/gymnasium-50868.appspot.com/o/Calves%2FSeated%20Calf%20Raises.mp4?alt=media&t" +
            "oken=da0faf0f-bcfd-4ced-a162-b908229b04a5"};

    public String[] getName() {
        return name;
    }

    public int[] getImage() {
        return image;
    }

    public String[] getUrl() {
        return url;
    }
}

