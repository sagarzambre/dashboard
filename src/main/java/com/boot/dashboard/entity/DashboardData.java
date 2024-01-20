package com.boot.dashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dashboard_data")
public class DashboardData {
	private Integer end_year;
	private Double citylng;
	private Double citylat;
	private Integer intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private Integer start_year;
	private Integer impact;
	private String added;
	private String published;
	private String city;
	private String country;
	private Integer relevance;
	private String pestle;
	private String source;
	private String title;
	private Integer likelihood;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public DashboardData() {
		
	}
	
	public DashboardData(Integer end_year, Double citylng, Double citylat, Integer intensity, String sector, String topic,
			String insight, String swot, String url, String region, Integer start_year, Integer impact, String added,
			String published, String city, String country, Integer relevance, String pestle, String source, String title,
			Integer likelihood, int id) {
		super();
		this.end_year = end_year;
		this.citylng = citylng;
		this.citylat = citylat;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.swot = swot;
		this.url = url;
		this.region = region;
		this.start_year = start_year;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.city = city;
		this.country = country;
		this.relevance = relevance;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public int getEnd_year() {
		return end_year;
	}
	public void setEnd_year(Integer end_year) {
		this.end_year= end_year;
	}
	public Double getCitylng() {
		return citylng;
	}
	public void setCitylng(Double citylng) {
		this.citylng = citylng;
	}
	public Double getCitylat() {
		return citylat;
	}
	public void setCitylat(Double citylat) {
		this.citylat = citylat;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getInsight() {
		return insight;
	}
	public void setInsight(String insight) {
		this.insight = insight;
	}
	public String getSwot() {
		return swot;
	}
	public void setSwot(String swot) {
		this.swot = swot;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getStart_year() {
		return start_year;
	}
	public void setStart_year(Integer start_year) {
		this.start_year = start_year;
	}
	public Integer getImpact() {
		return impact;
	}
	public void setImpact(Integer impact) {
		this.impact = impact;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getRelevance() {
		return relevance;
	}
	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}
	public String getPestle() {
		return pestle;
	}
	public void setPestle(String pestle) {
		this.pestle = pestle;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}

	@Override
	public String toString() {
		return "DashboardData [end_year=" + end_year + ", citylng=" + citylng + ", citylat=" + citylat + ", intensity="
				+ intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight + ", swot=" + swot
				+ ", url=" + url + ", region=" + region + ", start_year=" + start_year + ", impact=" + impact
				+ ", added=" + added + ", published=" + published + ", city=" + city + ", country=" + country
				+ ", relevance=" + relevance + ", pestle=" + pestle + ", source=" + source + ", title=" + title
				+ ", likelihood=" + likelihood + "]";
	}
	
}
