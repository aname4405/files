import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long EventTypeId;
    private String Date;
    private String StartTime;
    private String Duration;
    private Integer MaxNumber;
    private Integer Cost;
    private String SongList;

    public Event() {
    }

    public long getId() {
        return Id;
    }

    public long getEventTypeId() {
        return EventTypeId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String newDate) {
        this.Date = newDate;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String newStartTime) {
        this.StartTime = newStartTime;
    }
        
    public String getDuration() {
        return Duration;
    }

    public void setDuration(String newDuration) {
        this.Duration = newDuration;
    }
    public Integer getMaxNumber() {
        return MaxNumber;
    }

    public void setMaxNumber(Integer newMaxNumber) {
        this.MaxNumber = newMaxNumber;
    }
    
    public Integer getCost() {
        return Cost;
    }

    public void setCost(Integer newCost) {
        this.Cost = newCost;
    }
    public String getSongList() {
        return SongList;
    }

    public void setSongList(String newSongList) {
        this.SongList = newSongList;
    }

}
