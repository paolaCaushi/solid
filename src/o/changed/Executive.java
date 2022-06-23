package o.changed;

    public class Executive extends TypeEmployee implements Worker{
        @Override
        public void setRole() {
            this.isManager = true;
            this.isExecutive = true;
        }
    }

