const express = require('express');
const router = express.Router();
const Announcements = require('../models/Announcements'); 
const Carouselitems = require('../models/Carousel');
const dotenv = require('dotenv');
dotenv.config();

router.get('/announcements', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const announcements = await Announcements.find();
            res.json(announcements);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

router.get('/carousel', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const carouselitems = await Carouselitems.find();
            res.json(carouselitems);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});


module.exports = router;